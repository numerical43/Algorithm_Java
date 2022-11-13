import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static boolean isPrime(int num) {
        if (num == 1)
            return false;
        for (int i = 2; i < num; i++) {
            if ((num % i) == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] array = new int[n];

        for (int i = 0; i < n; i++)
            array[i] = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int temp = array[i];
            int num = 0;

            while (temp > 0) {
                int t = temp % 10;
                num = num * 10 + t;
                temp /= 10;
            }
            if (isPrime(num))
                sb.append(num).append(" ");
        }

        System.out.print(sb);

    }
}