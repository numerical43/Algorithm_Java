import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void recursion (int n) {
        if (n != 0) {
            recursion(n / 2);
            System.out.print(n % 2);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        recursion(n);
    }
}