package GA4;

public class Example8 {
    public void show() {
        NullPointerException e = new NullPointerException();
        e.initCause(new ArithmeticException());
        throw e;
    }

    public static void main(String[] args) {
        Example8 object = new Example8();
        try {
            object.show();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getCause());
        }
    }
}