import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();
        int answer = 0;

        for (int i = 1; i <= n; i++)
            queue.offer(i);

        while (!queue.isEmpty()) {
            for (int i = 1; i < k; i++)
                queue.offer(queue.poll());
            queue.poll();

            if (queue.size() == 1)
                answer = queue.poll();
        }

        System.out.print(answer);
    }
}