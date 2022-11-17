import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] array = new int[n];
        int result = 0;
        int sum = 0;
        int lt = 0;

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++)
            array[i] = Integer.parseInt(st.nextToken());

        for (int rt = 0; rt < n; rt++) {
            sum += array[rt];
            if (sum == m)
                result++;
            while (sum <= m) {
                sum -= array[lt++];
                if (sum == m)
                    result++;
            }
        }
        System.out.print(result);
    }
}