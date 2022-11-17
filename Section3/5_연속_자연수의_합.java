import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;
        int count = 1;
        n -= 1;

        while (n > 0) {
            count++;
            n -= count;
            if (n % count == 0)
                result++;
        }

        System.out.print(result);
    }
}