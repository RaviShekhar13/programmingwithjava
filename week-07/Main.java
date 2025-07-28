import java.util.logging.*;

public class Main {
    public void logIt() {
        Logger.getGlobal().info("First message");
    }
}

class FClass {
    public static void main(String[] args) {
        Main obj = new Main();
        obj.logIt();
        Logger.getGlobal().log(Level.FINE, "second message");
        Logger.getGlobal().setLevel(Level.OFF);
        try {
            throw new ArithmeticException();
        } catch (Exception e) {
            Logger.getGlobal().log(Level.SEVERE, "third message");
        }
        System.out.println("EOP");
    }
}