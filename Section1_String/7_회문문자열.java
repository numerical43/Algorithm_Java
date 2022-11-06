import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main {
    public static String check(String str) {
        int n = str.length();

        for (int i = 0; i < n/2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1))
                return ("NO");
        }
        return ("YES");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toLowerCase(Locale.ROOT);

        System.out.print(check(str));
    }
}