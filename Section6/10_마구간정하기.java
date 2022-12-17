import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static int counting (int[] arr, int mid) {
        int count = 1;
        int ep = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] - ep) >= mid) {
                count++;
                ep = arr[i];
            }
        }

        return count;
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int answer = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        int lt = 1;
        int rt = arr[n - 1];
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (counting(arr, mid) >= c) {
                answer = mid;
                lt = mid + 1;
            }
            else
                rt = mid - 1;
        }

        System.out.print(answer);
    }
}