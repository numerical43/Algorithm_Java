import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strS = br.readLine();
        String strT = br.readLine();
        int result = 0;
        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();

        for (char c : strT.toCharArray())
            mapT.put(c, mapT.getOrDefault(c, 0) + 1);

        int lengthT = strT.length() - 1;

        for (int i = 0; i < lengthT; i++)
            mapS.put(strS.charAt(i), mapS.getOrDefault(strS.charAt(i), 0) + 1);

        int lt = 0;

        for (int rt = lengthT;rt < strS.length(); rt++) {
            mapS.put(strS.charAt(rt), mapS.getOrDefault(strS.charAt(rt), 0) + 1);
            if (mapS.equals(mapT))
                result++;
            mapS.put(strS.charAt(lt), mapS.get(strS.charAt(lt)) - 1);
            if (mapS.get(strS.charAt(lt)) == 0)
                mapS.remove(strS.charAt(lt));
            lt++;
        }
        System.out.print(result);
    }
}