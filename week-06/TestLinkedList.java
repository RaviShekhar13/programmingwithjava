import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.add("val");
        System.out.println(l.peekFirst());
        System.out.println(l.peekLast());
        System.out.println(l.getFirst());
        System.out.println(l.removeLast());
    }
}
