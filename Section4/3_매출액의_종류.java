import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] array = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            array[i] = Integer.parseInt(st.nextToken());

        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < (k - 1); i++)
            hashMap.put(array[i], hashMap.getOrDefault(array[i], 0) + 1);

        int lt = 0;
        for (int rt = (k - 1); rt < n; rt++) {
            hashMap.put(array[rt], hashMap.getOrDefault(array[rt], 0) + 1);
            result.add(hashMap.size());
            hashMap.put(array[lt], hashMap.get(array[lt]) - 1);

            if (hashMap.get(array[lt]) == 0)
                hashMap.remove(array[lt]);
            lt++;
        }

        StringBuilder sb = new StringBuilder();
        for (Integer integer : result)
            sb.append(integer).append(" ");

        System.out.print(sb);
    }
}