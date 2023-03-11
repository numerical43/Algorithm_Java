import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] dis = {1, -1, 5};
    static int[] ch;
    static Queue<Integer> queue = new LinkedList<>();

    public static int BFS (int s, int e) {
        array = new int[10001];
        array[s] = 1;
        queue.offer(s);
        int L = 0;

        while (!queue.isEmpty()) {
            int length = queue.size();

            for (int i = 0; i < length; i++) {
                // int 는 원시타입으로 null 이 들어가면 에러남 (Integer 은 참조타입으로 null 이 들어가도 에러X)
                // int x = queue.poll() 을 사용할 경우(언박싱 : 참조타입 -> 원시타입) NullPointerException 일어날 수 있음
                // 그래서 queue.peek 으로 null 을 check 한 뒤 queue.poll() 실행
                if (queue.peek() == null)
                    return 0;
                int x = queue.poll();

                for (int j = 0; j < 3; j++) {
                    int nx = x + dis[j];
                    if (nx == e)
                        return L + 1;
                    if ((nx >= 1) && (nx <= 10000) && (array[nx] == 0)) {
                        array[nx] = 1;
                        queue.offer(nx);
                    }
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());

        System.out.println(BFS(s, e));
    }
}