import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static int n ;
    static int[] ch;

    public static void DFS (int L) {
        if (L == (n + 1)) {
            StringBuilder sb = new StringBuilder();

            for (int i = 1; i <= n; i++) {
                if (ch[i] == 1)
                    sb.append(i).append(" ");
            }
            if (sb.length() > 0)
                System.out.println(sb);
        }
        else {
            ch[L] = 1;
            DFS(L + 1);
            ch[L] = 0;
            DFS(L + 1);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        DFS(1);
    }
}