import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static ArrayList<ArrayList<Integer>> graph;
    static int n, m, answer = 0;
    static int[] array;

    public static void DFS(int v) {
        if (v == n)
            answer++;
        else {
            for (int value : graph.get(v)){
                if (array[value] == 0) {
                    array[value] = 1;
                    DFS(value);
                    array[value] = 0;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        graph = new ArrayList<>();

        for (int i = 0; i <= n; i++)
            graph.add(new ArrayList<>());

        array = new int[n+1];
        for (int i = 0; i < m; i++){
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
        }
        array[1] = 1;
        DFS(1);

        System.out.println(answer);
    }
}