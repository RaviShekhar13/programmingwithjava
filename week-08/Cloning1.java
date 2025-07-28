import java.util.*;

public class Cloning1 {

}

class Items implements Cloneable {
    public String[] item;

    public Items(String[] item) {
        this.item = item;
    }

    public String toString() {
        String r = "";
        for (String item : this.item) {
            r = r + item + " ";
        }
        return r;
    }

    public Items clone() throws CloneNotSupportedException {
        String[] clonelist = Arrays.copyOf(item, item.length);
        Items newitem = new Items(clonelist);
        return newitem;
    }
}

class Customer implements Cloneable {
    String name;
    Items item;

    Customer(String name, Items item) {
        this.name = name;
        this.item = item;
    }

    public void setName(String s) {
        this.name = s;
    }

    @Override
    public String toString() {
        return name + " " + item;
    }

    public Items getItems() {
        return item;
    }

    protected Customer clone() throws CloneNotSupportedException {
        Customer cs = (Customer) super.clone();
        cs.item = (Items) item.clone();
        return cs;
    }
}