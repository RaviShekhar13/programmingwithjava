package util.iitm.java;

public class Data {
    void show() {
        System.out.println("This is show");
    }
}

// UseData.java
package iitm.java.program;
public class UseData {
       public static void main(String[] args) {
             new util.iitm.java.Data().show();
       }
}