import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int m = 0;
        String[] str = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            int nowNum = Integer.parseInt(str[i]);

            if (m < nowNum){
                sb.append(nowNum).append(" ");
            }
            m = nowNum;
        }

        System.out.print(sb);
    }
}