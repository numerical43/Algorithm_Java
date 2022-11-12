import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] array = br.readLine().split(" ");
        int result = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            int nowNum = Integer.parseInt(array[i]);

            if (nowNum > max) {
                result++;
                max = nowNum;
            }
        }

        System.out.print(result);
    }
}