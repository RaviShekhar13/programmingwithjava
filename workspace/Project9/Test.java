package Project9;

public class Test {
    
}

import java.util.*;

class ArrayExample<T> {
    T[] a;

    // Define constructor(s) as needed
    public ArrayExample(T[] a) {
        this.a = a;

    }

    // Define method display() that print the elements of array a
    public void display() {
        for (T t : this.a) {
            System.out.println(t);
        }
    }

    // Define method elementCount(T x) that
    // counts the no. of times x is present in the array a
    public int elementCount(T x) {
        int count = 0;
        for (T y : this.a) {
            if (y == x) {
                count++;
            }
            return count;
        }
    }
}

public class ArrayObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt(); // Taking input for length of the array
        Integer[] x = new Integer[len];
        for (int i = 0; i < len; i++) {
            x[i] = sc.nextInt(); // Taking input for Integer array
        }

        // Write the code here to create an object obj for Integer array
        // Integer[] eleX = new Integer[len];
        // for(int i = 0; i < len; i++){
        // eleX[i] = x[i];
        // }
        int s1 = sc.nextInt();
        int maxX = s1;
        int countMaxX = 0;
        for (int i = 0; i < len; i++) {
            if (x[i] == maxX) {
                countMaxX += 1;
            } else {
                if (countMaxX == 0) {
                    maxX = x[i];
                    countMaxX += 1;
                } else {
                    countMaxX -= 1;
                }
            }
        }

        for (int i = 0; i < len; i++) {
            System.out.print(eleX[i] + " ");
        }
        System.out.print(countMaxX);

        String s2 = sc.nextString(); // Taking input for the value to be counted
        String[] y = new String[len];
        for (int i = 0; i < len; i++) {
            y[i] = sc.next(); // Taking input for String array
        }

        // Write the code here to create an object obj1 for String array
        // String[] eleY = new String[len];
        // for(int i = 0; i < len; i++){
        // eleY[i] = y[i];
        // }
        String maxY = s2;
        int countMaxY = 0;
        for (int i = 0; i < len; i++) {
            if (eleY[i] > maxY) {
                maxY = eleY[i];
                countMaxY = 1;
            } else {
                if (eleY[i] == maxY) {
                    countMaxY++;
                }
            }
        }

        for (int i = 0; i < len; i++) {
            System.out.print(eleY[i] + " ");
        }
        System.out.print(countMaxY);

        String s2 = sc.next(); // Taking input for the value to be counted
        obj.display();
        System.out.println(obj.elementCount(s1));
        obj1.display();
        System.out.println(obj1.elementCount(s2));
    }
}
