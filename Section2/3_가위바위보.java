import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n];
        int[] B = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++)
            A[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++)
            B[i] = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            if (A[i] == B[i])
                sb.append("D\n");
            else if (A[i] == 1 && B[i] == 2)
                sb.append("B\n");
            else if (A[i] == 2 && B[i] == 3)
                sb.append("B\n");
            else if (A[i] == 3 && B[i] == 1)
                sb.append("B\n");
            else
                sb.append("A\n");

        }

        System.out.print(sb);
    }
}