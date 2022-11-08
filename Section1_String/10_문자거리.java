import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int[] check (String str, char c) {
        int[] result = new int[str.length()];
        int p = 1000;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c)
                p = 0;
            else
                p++;
            result[i] = p;
        }

        p = 1000;

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == c)
                p = 0;
            else {
                p++;
                result[i] = Math.min(result[i], p);
            }
        }

        return result;
    }

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        String str = st.nextToken();
        char c = st.nextToken().charAt(0);


        for (int i : check(str, c))
            sb.append(i).append(" ");


        System.out.print(sb);
    }
}