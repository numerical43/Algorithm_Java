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

        for (int i = 0; i < n; i++)
            array.add(Integer.parseInt(st.nextToken()));

        int result = 0;
        int weight = 0;

        for (int i = 0; i < n; i++) {
            if (array.get(i) == 1) {
                weight++;
                result += weight;
            }
            else
                weight = 0;
        }

        System.out.print(result);
    }
}