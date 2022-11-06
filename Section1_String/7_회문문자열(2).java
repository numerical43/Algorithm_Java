import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main {
    public static String check(String str) {
        String sb = new StringBuilder(str).reverse().toString();

        if (str.equals(sb))
            return ("YES");
        return ("NO");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toLowerCase(Locale.ROOT);

        System.out.print(check(str));
    }
}