import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < (n - 1); i++) {
            int index = i;
            for (int j = (i + 1); j < n; j++)
                if (arr[j] < arr[index])
                    index = j;
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        for (int i : arr)
            sb.append(i).append(" ");

        System.out.print(sb);

    }
}