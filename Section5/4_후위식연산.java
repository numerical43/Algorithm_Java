import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Stack<Integer> stack = new Stack<>();
        int answer;

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c))
                stack.push(c - 48);
            else{
                int rt = stack.pop();
                int lt = stack.pop();

                switch (c) {
                    case '+' ->
                            stack.push(lt + rt);
                    case '-' ->
                            stack.push(lt - rt);
                    case '*' ->
                            stack.push(lt * rt);
                    case '/' ->
                            stack.push(lt / rt);
                }
            }
        }
        // answer = stack.get(0);
        answer = stack.peek();

        System.out.print(answer);
    }
}
