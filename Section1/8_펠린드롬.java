import java.util.*;
import java.io.*;


public class Main {
    public static String check (String str) {
        //replaceAll : [^a-z] a-z 를 제외한 모든 문자 (^ 는 제외라는 뜻)
        //             [0-9] 0-9 까지의 모든 숫자
        //             [\uAC00-\uD7A3] 모든 한글 음절
        //             [\\s]  띄어쓰기
        str = str.toLowerCase(Locale.ROOT).replaceAll("[^a-z]", "");
        String copy = new StringBuilder(str).reverse().toString();

        if (str.equals(copy))
            return ("YES");

        return ("NO");
    }

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.print(check(str));
    }
}