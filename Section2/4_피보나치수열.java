import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int num = 0;
        int now = 1;

        sb.append("1 ");

        for (int i = 0; i < (n - 1); i++) {
            sb.append(num + now).append(" ");
            int temp = now;
            now = num + now;
            num = temp;
        }

        System.out.print(sb);
    }
}