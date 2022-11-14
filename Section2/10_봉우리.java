import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[n + 2][n + 2];
        int result = 0;

        for (int i = 0; i <= n + 1; i++) {
            map[0][i] = 0;
            map[i][0] = 0;
            map[n + 1][i] = 0;
            map[i][n + 1] = 0;
        }

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 1; j <= n ; j++)
                map[i][j] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int now = map[i][j];
                if ((map[i - 1][j] < now) && (map[i][j - 1] < now) && (map[i + 1][j] < now) && (map[i][j + 1] < now))
                    result++;
            }
        }

        System.out.print(result);
    }
}