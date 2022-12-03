import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Person {
    int id;
    int priority;

    public Person (int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

public class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<Person> queue = new LinkedList<>();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int [n];
        int answer = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++)
            queue.offer(new Person(i, arr[i]));

        while (!queue.isEmpty()) {
            Person temp = queue.poll();

            for (Person p : queue) {
                if (p.priority > temp.priority) {
                    queue.offer(temp);
                    temp = null;
                    break;
                }
            }

            if (temp != null) {
                answer++;
                if (temp.id == m)
                    break;
            }
        }

        System.out.print(answer);
    }
}