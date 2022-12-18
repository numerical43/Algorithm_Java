import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static int factorial(int n) {
        if (n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.print(factorial(n));
    }
}