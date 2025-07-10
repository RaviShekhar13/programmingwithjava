
import java.io.*;
// import java.util.*;
import java.util.regex.*;

public class Ex01 {

    public static void main(String[] args) throws Exception {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the IP Address to be tested(or PRESS ENTER to QUIT): ");
        String input = br.readLine();
        // while(input != null){
        Pattern p = Pattern.compile(MyRegex.pattern);
        Matcher m = p.matcher(input);
        boolean b = m.matches();
        System.out.println(b);
        // System.out.println("Please enter the IP Address to be tested(or PRESS ENTER
        // to QUIT): ");
        // input = br.readLine();
        // }

    }
}

class MyRegex {
    static String pattern = "[0-255].[0-255].[0-255].[0-255]";

}
