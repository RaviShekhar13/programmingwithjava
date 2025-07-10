import java.util.*;

public class Test3 {
    public static boolean balanceCheck(String sequence) {
        // Write your code here

        final Stack<Character> s1 = new Stack<>();
        for (final char c : sequence.toCharArray()) {
            switch (c) {
                case '[':
                case '{':
                case '(':
                    s1.push(c);

                    break;
                case ']':
                    if (s1.isEmpty() || s1.pop() != '[') {
                        return false;
                    }
                    break;
                case '}':
                    if (s1.isEmpty() || s1.pop() != '{') {
                        return false;
                    }
                    break;
                case ')':
                    if (s1.isEmpty() || s1.pop() != '(') {
                        return false;
                    }

                    break;

                default:
                    break;
            }
        }

        return s1.isEmpty();
    }

    public static void main(String args[]) {
        // Scanner s = new Scanner(System.in);

        ArrayList<String> expr_arr = new ArrayList<String>();
        String inp = null;

        inp = "{)}public void fun(Integer[] arr){ if(arr.length > 7){ print(\"ok\");}({[]})[][()]";
        inp = "static void main(String args[]){System.out.println();}class a{ public static void main(String args[]){System.out.println();}}}}{{()()[(){()}]void fun(int x, double y){ x = x*y; return x;}done";

        if (balanceCheck(inp)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}
