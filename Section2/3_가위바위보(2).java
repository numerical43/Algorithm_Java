import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String[] A = br.readLine().split(" ");
        String[] B = br.readLine().split(" ");


        for (int i = 0; i < n; i++) {
            int intA = Integer.parseInt(A[i]);
            int intB = Integer.parseInt(B[i]);

            if (intA == intB)
                sb.append("D\n");
            else if (intA == 1 && intB == 2)
                sb.append("B\n");
            else if (intA == 2 && intB == 3)
                sb.append("B\n");
            else if (intA == 3 && intB == 1)
                sb.append("B\n");
            else
                sb.append("A\n");

        }

        System.out.print(sb);
    }
}