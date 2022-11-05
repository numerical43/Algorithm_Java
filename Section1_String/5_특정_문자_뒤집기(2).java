import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] array = str.toCharArray();
        int rear = str.length() - 1;

        for (int front = 0; front < rear; front++) {
            if (Character.isAlphabetic(array[front])){
                while (!Character.isAlphabetic(array[rear]))
                    rear--;
                char temp = array[front];
                array[front] = array[rear];
                array[rear] = temp;
                rear--;
            }
        }
        String result = String.valueOf(array);
        System.out.print(result);
    }
}