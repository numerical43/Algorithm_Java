import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] array = new int[n];
        int result = 0;
        int count = 0;
        int lt = 0;

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++)
            array[i] = Integer.parseInt(st.nextToken());

        for (int rt = 0; rt < n; rt++) {
            if (array[rt] == 0)
                count++;
            while (count > k) {
                if (array[lt] == 0)
                    count--;
                lt++;
            }
            result = Math.max(result, (rt - lt + 1));
        }

        System.out.print(result);
    }
}