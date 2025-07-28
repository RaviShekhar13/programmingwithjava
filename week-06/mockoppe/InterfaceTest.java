package mockoppe;

import java.util.*;

// Define interface Appraisable
// import java.util.stream.*;
interface Appraisable {
    default void appraisal(Teacher t) {
        // System.out.println("--------Inside Appraisable");
        t.setSalary(t.getSalary() + (t.getstuPassPer() / 100) * 5000);
    }

    void checkAndUpdateSalary();
}

// Define interface SpecialAppraisable
interface SpecialAppraisable extends Appraisable {
    default void spAppraisal(Teacher t) {
        // System.out.println("--------Inside SpecialAppraisable");

        t.setSalary(t.getSalary() + (t.getstuPassPer() / 100) * 10000);
    }
}

class Teacher implements SpecialAppraisable {
    private String name;
    private double salary;
    private double stuPassPer;

    public Teacher(String name, double salary, double stuPassPer) {
        this.name = name;
        this.salary = salary;
        this.stuPassPer = stuPassPer;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getstuPassPer() {
        return stuPassPer;
    }

    public String toString() {
        return name + ", " + salary + ", " + stuPassPer;
    }

    public void checkAndUpdateSalary() {
        // System.out.println("Inside checkAndUpdateSalary");
        if (stuPassPer >= 60 && stuPassPer < 75)
            appraisal(this);
        else if (stuPassPer >= 75 && stuPassPer <= 100)
            spAppraisal(this);
    }
}

public class InterfaceTest {
    // Define method printUpdatedTeachList
    static void printUpdatedTeachList(Teacher[] t) {
        Arrays.stream(t).forEach(e -> {
            e.checkAndUpdateSalary();
            System.out.println(e);
        });
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        Teacher tArr[] = new Teacher[3];
        tArr[0] = new Teacher("Akshay", 50000, 64.5);
        tArr[1] = new Teacher("Anasuya", 60000, 80.00);
        tArr[2] = new Teacher("Abhaya", 75000, 70);
        // for (int i = 0; i < tArr.length; i++)
        // tArr[i] = new Teacher(sc.next(), sc.nextDouble(), sc.nextDouble());
        InterfaceTest.printUpdatedTeachList(tArr);
    }
}