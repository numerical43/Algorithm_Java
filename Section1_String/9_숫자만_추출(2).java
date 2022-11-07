import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String result = "";

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c))
                result += c;
        }

        System.out.print(Integer.parseInt(result, 10));
    }
}