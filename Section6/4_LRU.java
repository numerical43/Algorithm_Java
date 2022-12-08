import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        int[] cache = new int[s];

        for (int x : arr) {
            int pos = -1;

            for (int i = 0; i < s; i++)
                if (x == cache[i])
                    pos = i;

            if (pos == -1) {
                for (int i = (size - 1); i >= 1; i--)
                    cache[i] = cache[i - 1];
            }
            else  {
                for (int i = pos; i >= 1; i--)
                    cache[i] = cache[i - 1];
            }

            cache[0] = x;
        }

        StringBuilder sb = new StringBuilder();
        for (int i : cache)
            sb.append(i).append(" ");
    }
}