import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] array = new int[n];
        int max = 0;

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++)
            array[i] = Integer.parseInt(st.nextToken());

        for (int i = 0; i < (n - k); i++) {
            int sum = 0;

            for (int j = 0; j < k; j++)
                sum += array[i + j];

            if (sum > max)
                max = sum;
        }
        System.out.print(max);
    }
}