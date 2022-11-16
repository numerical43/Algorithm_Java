import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++)
            arr1[i] = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++)
            arr2[i] = Integer.parseInt(st.nextToken());

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++)
            result.add(arr1[i]);
        for (int i = 0; i < m; i++)
            result.add(arr2[i]);

        //기본 오름차순으로 정렬
        Collections.sort(result);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n+m; i++)
            sb.append(result.get(i)).append(" ");

        System.out.print(sb);

    }
}