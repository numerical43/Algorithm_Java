import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

class Node {
    int data;
    Node lt, rt;

    // 생성자
    public Node(int data) {
        this.data = data;
        lt = rt = null;
    }
}

public class Main {
    static Node root;

    public static void BFS(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int L = 0;

        while (!queue.isEmpty()) {
            int length = queue.size();
            System.out.print(L + " ");

            for (int i = 0; i < length; i++) {
                Node cur = queue.poll();
                System.out.print(Objects.requireNonNull(cur).data + " ");
                if (cur.lt != null)
                    queue.add(cur.lt);
                if (cur.rt != null)
                    queue.add(cur.rt);
            }
            L++;
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);
        BFS(root);
    }
}