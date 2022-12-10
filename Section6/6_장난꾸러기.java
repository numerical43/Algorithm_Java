import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());


        StringBuilder sb = new StringBuilder();
        int[] temp = arr.clone();
        Arrays.sort(temp);

        for (int i = 0; i < n; i++)
            if (arr[i] != temp[i])
                sb.append(i + 1).append(" ");

        System.out.print(sb);
    }
}