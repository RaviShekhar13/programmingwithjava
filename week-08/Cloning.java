
import java.util.*;

//Define classes Items, Customer

class Items implements Cloneable {
    public String[] item;

    public Items() {

    }

    public Items(String[] items) {
        this.item = items;
    }

    public String[] getItems() {
        return this.item;
    }

    public void setItems(String[] items) {
        this.item = items;
    }

    public String toString() {
        String output = "";
        for (String item : this.item) {
            output = output + item + " ";
        }
        return output;
    }

    public Items clone() throws CloneNotSupportedException {
        return (Items) super.clone();
    }
}

class Customer implements Cloneable {
    // Instance variable name of type String to store the name of the customer
    String name;
    // – Instance variable of type Items to store the items purchased by the
    // customer
    public Items item;

    public Customer() {

    }

    public Customer(String name, Items items) {
        this.name = name;
        this.item = items;
    }

    // – Implement the constructor(s), the accessor getItems() to return the object
    Items getItems() {
        return this.item;
    }

    String getName() {
        return this.name;
    }

    // of Items, and the mutator setName(String s) to update the name of the
    // customer.
    void setName(String name) {
        this.name = name;
    }

    // – Override the method clone
    public Customer clone() throws CloneNotSupportedException {
        Customer cs = (Customer) super.clone();
        cs.item = (Items) item.clone();
        return cs;
    }

    // – Override the method toString so that the for
    public String toString() {
        String result = "";
        result += this.getName();
        for (String item : this.getItems().getItems()) {
            result += " " + item;
        }
        return result;
    }
}

class Order {
    public static void main(String[] args) throws CloneNotSupportedException {

        int n = 2;
        String[] sc = { "milk", "bread", "maggi" };

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt(); // number of items

        String[] itm = new String[n];
        for (int i = 0; i < n; i++) {
            itm[i] = sc[i]; // list of items
        }
        var c1 = new Customer("naresh", new Items(itm));
        Customer c2 = c1.clone();
        c2.getItems().item[0] = "maggi"; // Update first item of c2
        c2.setName("suresh"); // Update name of c2
        System.out.println(c1);
        System.out.println(c2);
    }
}