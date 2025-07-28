
class Employee {
    public Employee() {
    }

    public String toString() {
        return "from Employee";
    }
}

class Manager extends Employee {
    public Manager() {
    }

    public String toString() {
        return "from Manager";
    }
}

class GA_08_04 {
    public static void main(String[] args) {
        Employee e = new Manager();
        var o1 = e;
        var o2 = new Employee();
        var o3 = new Manager();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
    }
}