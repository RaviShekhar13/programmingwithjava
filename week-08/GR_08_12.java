class Person {
    String name;

    // Constructor
    public String toString() {
        return name;
    }
}

class Instructor extends Person implements Cloneable {
    int salary;

    // Constructor
    public Instructor(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public Instructor clone() throws CloneNotSupportedException {
        return (Instructor) super.clone();
    }

    public String toString() {
        return (super.toString() + ": " + salary);
    }
}

public interface GR_08_12 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Instructor i1 = new Instructor("Aparna", 120000);
        Instructor i2 = i1.clone();
        i2.name = "Neha";
        i2.salary = 180000;
        System.out.println(i1 + "\n" + i2);
    }
}
