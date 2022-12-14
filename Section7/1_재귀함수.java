import java.io.*;

public class Main {
    public static void recursion (int n) {
        if (n != 0) {
            recursion(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        recursion(n);
    }
}