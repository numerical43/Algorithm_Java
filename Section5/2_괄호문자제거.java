import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == ')')
                while (stack.pop() != '(');
            else stack.push(c);
        }

        for (char c : stack)
            result.append(c);

        System.out.print(result);
    }
}