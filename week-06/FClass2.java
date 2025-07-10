import java.util.*;

public class FClass2 {
    public static void main(String args[]) {
        ArrayList<String> sList = new ArrayList<String>();
        sList.add("A");
        sList.add("B");
        ListIterator<String> iter = sList.listIterator();
        if (iter.hasNext()) {
            System.out.println(iter.nextIndex());
            System.out.println(iter.next());
            System.out.println(iter.nextIndex());

            iter.add("C");
            System.out.println(iter.nextIndex());
            System.out.println("---------" + sList);
        }
        if (iter.hasPrevious()) {
            System.out.println(iter.previousIndex());
            System.out.println(iter.previous());
            System.out.println(iter.previousIndex());

            iter.add("D");
            System.out.println(iter.previousIndex());

            System.out.println("---------" + sList);

        }
        sList.add("E");
        System.out.println(sList);
    }
}