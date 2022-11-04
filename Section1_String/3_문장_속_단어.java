import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main (String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String result = "";

        while (st.hasMoreTokens()) {
            String str = st.nextToken();
            if (str.length() > result.length())
                result = str;
        }
        System.out.println(result);
    }
}