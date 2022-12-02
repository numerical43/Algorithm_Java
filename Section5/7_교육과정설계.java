import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Character> queue = new LinkedList<>();
        String strA = br.readLine();
        String strB = br.readLine();
        String answer = "YES";


        for (char c : strA.toCharArray())
            queue.offer(c);

        for (char c : strB.toCharArray()) {
            if (queue.contains(c))
                if (c != queue.poll())
                    answer = "NO";
        }

        if (!queue.isEmpty())
            answer = "NO";

        System.out.print(answer);
    }
}