import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max = 0;
        int sum1, sum2, sum3, sum4;
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++)
                array[i][j] = Integer.parseInt(st.nextToken());
        }

        sum3 = sum4 = 0;

        for (int i = 0; i < n; i++) {
            sum1 = sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += array[i][j];
                sum2 += array[j][i];
            }
            sum3 += array[i][i];
            sum4 += array[i][n - i - 1];

            max = Math.max(max, sum1);
            max = Math.max(max, sum2);
        }

        max = Math.max(max, sum3);
        max = Math.max(max, sum4);

        System.out.print(max);
    }
}