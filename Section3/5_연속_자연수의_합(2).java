import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int result = 0;
        int sum = 0;
        int lt = 0;
        int m = (n / 2) + 1;

        for (int i = 0; i < n; i++)
            arr[i] = i + 1;

        for (int rt = 0; rt < m; rt++) {
            sum += arr[lt++];
            if (sum == n)
                result++;
            while (sum >= n) {
                sum -= arr[lt++];
                if (sum == n)
                    result++;
            }
        }

        System.out.print(result);
    }
}