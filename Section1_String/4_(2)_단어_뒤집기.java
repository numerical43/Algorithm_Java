import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = new String[n];

        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < n; i++)
            str[i] = br.readLine();

        for (String s : str) {
            String temp = new StringBuilder(s).reverse().toString();
            arrayList.add(temp);
        }
        System.out.print(arrayList);
    }
}