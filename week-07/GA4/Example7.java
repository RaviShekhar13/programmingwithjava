package GA4;

public class Example7 {
    public static void main(String[] args) {
        String name = "IIT Madras";
        try {
            System.out.println(name.charAt(10));
        } catch (Throwable e) {
            System.out.println("----" + e.getMessage());
        }
        // Line 1
    }
}
