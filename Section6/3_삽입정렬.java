import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            int temp  = arr[i];
            int j;
            for (j = (i - 1); j >= 0; j--) {
                if (arr[j] > temp)
                    arr[j + 1] = arr[j];
                else
                    break;
            }
            arr[j + 1] = temp;
        }

        StringBuilder sb = new StringBuilder();
        for (int i : arr)
            sb.append(i).append(" ");

        System.out.print(sb);
    }
}