package p1;

import java.io.*;
// import java.util.*;
import java.util.regex.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        // while (input != null) {
        System.out.println(input);
        System.out.println(MyRegex.pattern);
        Pattern p = Pattern.compile(MyRegex.pattern);
        Matcher m = p.matcher(input);
        boolean b = m.find();
        System.out.println(b);
        // input = br.readLine();
        // }

    }
}

class MyRegex {
    // static String pattern = "[[0-9]|[10-99]|[100-199]|[200-255]].[[0-9]|[10-99]|[100-199]|[200-255]].[[0-9]|[10-99]|[100-199]|[200-255]].[[0-9]|[10-99]|[100-199]|[200-255]]";
    // static String pattern = "[0-9]|[1-9][0-9]|[1-9][0-9][0-9]|2[0-4][0-9]|25[0-5].[0-9]|[1-9][0-9]|[1-9][0-9][0-9]|2[0-4][0-9]|25[0-5].[0-9]|[1-9][0-9]|[1-9][0-9][0-9]|2[0-4][0-9]|25[0-5].[0-9]|[1-9][0-9]|[1-9][0-9][0-9]|2[0-4][0-9]|25[0-5]";
    static String pattern = "\\b([0-9]|[1-9][0-9]|1[0-9][0-9])\\.|(2[0-4][0-9]|25[0-5])\\.|(2[0-4][0-9]|25[0-5]|)\\b";
// \b([0-9]|[1-9][0-9]|1[0-9][0-9])\.|(2[0-4][0-9]|25[0-5])\.|(2[0-4][0-9]|25[0-5]|)\b
}
