import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Character, Integer> map = new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        int max = Integer.MIN_VALUE;
        String str = br.readLine();
        char result = 0;

        for (char c : str.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        for (char key : map.keySet()) {
            int nowValue = map.get(key);
            if (nowValue > max) {
                max = nowValue;
                result = key;
            }
        }
        
        System.out.print(result);
    }
}