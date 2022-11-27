import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String result = "YES";
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(')
                stack.push(c);
            else {
                if (stack.isEmpty()) {
                    result = "NO";
                    break;
                }
                stack.pop();
            }
        }

        if (!stack.isEmpty())
            result = "NO";

        System.out.print(result);
    }
}