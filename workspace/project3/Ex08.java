package project3;

import java.util.*;

class NumData {
    private Number n;

    public NumData(Number n) {
        this.n = n;
    }

    public String getMetaInfo() {
        if (n instanceof Integer) {
            return "Integer type, value = " + n;
        } else if (n instanceof Double) {
            return "Double type, value = " + n;
        } else if (n instanceof Character) {
            return "Character type, value = " + n;
        } else
            return "Number type, value = " + n;
    }
}

class FClass {
    public static void main(String[] args) {
        Integer i0 = 10;
        Float f0 = 3.14f;
        Character c0 = 'A';
        NumData o1 = new NumData(i0);
        NumData o2 = new NumData(f0);
        NumData o3 = new NumData(c0);
        System.out.println(o1.getMetaInfo());
        System.out.println(o2.getMetaInfo());
        System.out.println(o3.getMetaInfo());
    }
}
