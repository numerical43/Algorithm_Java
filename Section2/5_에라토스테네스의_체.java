import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n + 1];
        int count = 0;

        // 에라토스테네스의 체 (소수 구하기)
        for (int i = 2; i <= n; i++) {
            if (array[i] == 0) {
                count++;
                for (int j = i; j <= n; j = (j + i))
                    array[j] = 1;
            }
        }

        System.out.print(count);
    }
}