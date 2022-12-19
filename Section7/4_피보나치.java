import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static int fibonacci(int n) {
        if (n == 1)
            return 1;
        else if (n == 2)
            return 1;
        else
            return fibonacci(n - 2) + fibonacci(n - 1);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++)
            sb.append(fibonacci(i)).append(" ");

        System.out.print(sb);
    }
}