import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int result;

        // [^0-9] -> 0~9를 제외한 모든 문자
        str = str.replaceAll("[^0-9]", "");

        // Integer.parseInt (String, 몇 진수로 변환할지)
        if (str.equals(""))
            result = 0;
        else
            result = Integer.parseInt(str, 10);

        System.out.print(result);
    }
}