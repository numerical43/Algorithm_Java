import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        str = str + " ";
        int count = 1;

        for (int i = 0; i < (str.length() - 1); i++) {
            if (str.charAt(i) == str.charAt(i + 1))
                count++;
            else {
                sb.append(str.charAt(i));
                if (count > 1)
                    sb.append(count);
                count = 1;
            }
        }
        System.out.print(sb);
    }
}