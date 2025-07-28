import java.util.stream.*;
import java.util.*;

class Product {
    private String name;
    private double price;

    public Product(String n, double p) {
        name = n;
        price = p;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return name + " : " + price;
    }
}

public class GR_08_07 {
    public static void main(String[] args) {
        var pList = new ArrayList<Product>();
        pList.add(new Product("Pen", 10.0));
        pList.add(new Product("Pencil", 5.0));
        pList.add(new Product("Notebook", 40.0));
        pList.add(new Product("Eraser", 8.0));

        var outputList = pList.stream().takeWhile(x -> x.getPrice() >= 10); // LINE 1
        outputList.forEach(n -> System.out.println(n));
    }
}