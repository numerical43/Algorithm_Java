import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = str.length();
        int count = 0;
        char[] array = new char[n];
        char[] result = new char[n];

        for (int i = 0; i < n; i++) {
            result[i] = str.charAt(i);
            if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
                array[count] = str.charAt(i);
                count++;
            }
        }

        for (int i = (n - 1); i >= 0; i--) {
            if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
                result[i] = array[count];
                count--;
            }
        }

        System.out.println(result);
    }
}