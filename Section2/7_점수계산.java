import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        ArrayList<Integer> array = new ArrayList<>();
        int result;
        int weight = 0;

        for (int i = 0; i < n; i++)
            array.add(Integer.parseInt(st.nextToken()));

        result = array.get(0);

        for (int i = 1; i < n; i++) {
            int now = array.get(i);

            if (array.get(i - 1) == 0 || array.get(i) == 0)
                weight = 0;
            else
                weight += 1;

            result += (weight + now);
        }

        System.out.print(result);
    }
}