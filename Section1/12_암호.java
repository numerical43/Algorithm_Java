import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args) throws NumberFormatException,IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < len; i++) {
            String temp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            // radix = 진수, 밑의 경우는 String 형인 temp 를 이진수 Int 로 변환
            int n = Integer.parseInt(temp, 2);
            str = str.substring(7);
            sb.append((char)n);
        }

        System.out.print(sb);
    }
}