package iitm.java.program;

public class Example12 {

}

class FileHandler {
    public static void readFile(String fileName) throws Exception {
        if (fileName == null) {
            throw new Exception("Filename is null");
        }
        System.out.println("Reading file: " + fileName);
    }

    public static void processFiles() throws Exception {
        try {
            readFile("data.txt");
            readFile(null);
        } catch (Exception e) {
            System.out.println("Caught in processFiles");
            throw e;
        }
    }
}

class FileTest {
    public static void main(String[] args) throws Throwable {
        try {
            FileHandler.processFiles();
        } catch (Exception e) {
            System.out.println("Caught in main");
        }
    }
}