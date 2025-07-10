package project5;

public class Ex10 {

}

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

class Developer extends Employee {

    public Developer(String string, double d) {
        // TODO Auto-generated constructor stub
    }

    // implementation with some new instance variable and methods
    public double getTotalSalary() {
        return 0.0;
    }
}

class Manager extends Employee {
    // implementation with some new instance variable and methods
    public Manager(String string, double d) {
        // TODO Auto-generated constructor stub
    }

    public double getTotalSalary() {
        return 0.0;
    }
}

class SalaryStat<T extends Employee> {
    private T[] eps;

    public SalaryStat(T[] eps) {
        this.eps = eps;
    }

    private double getTotalSalary() {
        double total = 0;
        for (int i = 0; i < eps.length; i++)
            total += eps[i].getSalary();
        return total;
    }

    public boolean greaterSalary(SalaryStat<? extends Employee> d) { // LINE 1
        if (this.getTotalSalary() > d.getTotalSalary())
            return true;
        return false;
    }
}

class FClass {
    public static void main(String[] args) {
        Developer[] dA = { new Developer("A", 50000.0), new Developer("B", 40000.0),
                new Developer("C", 45000.0) };
        Manager[] mA = { new Manager("X", 65000.0), new Manager("Y", 51000.0) };
        SalaryStat<Developer> dO = new SalaryStat<Developer>(dA);
        SalaryStat<Manager> mO = new SalaryStat<Manager>(mA);
        if (mO.greaterSalary(dO))
            System.out.println("managers have higher salary expenditure");
        else
            System.out.println("developers have higher salary expenditure");
    }
}