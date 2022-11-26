import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        int result = -1;

        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            for (int j = (i + 1); j < n; j++) {
                for (int l = (j + 1); l < n; l++)
                    treeSet.add(arr[i] + arr[j] + arr[l]);
            }
        }

        int count = 0;

        for (int t : treeSet) {
            count++;
            if (count == k) {
                result = t;
                break;
            }
        }

        System.out.print(result);
    }
}