import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int n, m, answer=0;
    static int[][] graph;
    static int[] array;

    public static void DFS(int v){
        if (v == n)
            answer++;
        else{
            for (int i = 1; i <= n; i++){
                if (graph[v][i] == 1 && array[i] == 0) {
                    array[i] = 1;
                    DFS(i);
                    array[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        graph = new int[n + 1][n + 1];
        array = new int[n + 1];

        for (int i = 0; i < m; i++){
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = 1;
        }
        array[1] = 1;
        DFS(1);

        System.out.println(answer);
    }
}