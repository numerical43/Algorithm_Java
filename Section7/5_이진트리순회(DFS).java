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

    public static void DFS (Node root) {
        if (root == null)
            return ;
        else {
            DFS(root.lt);
            System.out.print(root.data+" ");
            DFS(root.rt);
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
        DFS(root);
    }
}