import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] array = new int[n + 1][6];
        int max = 0;
        int result = 0;
        int sameClass;

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 1; j <= 5 ; j++)
                array[i][j] = Integer.parseInt(st.nextToken());
        }

        // i = 학생 번호
        for (int i = 1; i <= n; i++) {
            sameClass = 0;
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (array[i][k] == array[j][k]) {
                        sameClass++;
                        break;
                    }
                }
            }
            if (sameClass > max) {
                max = sameClass;
                result = i;
            }
        }

        System.out.print(result);
    }
}