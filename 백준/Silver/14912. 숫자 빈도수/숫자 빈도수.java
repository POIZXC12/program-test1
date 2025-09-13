
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //String input = br.readLine();
        //int a = Integer.parseInt(br.readLine());

        int number = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        int count = 0;
        for (int i = 1; i <= number; i++) {
            int x = i;

            while(x > 0) {
                if (x % 10 == target) {
                    count += 1;
                }
                x /= 10;
            }
        }
        System.out.println(count);
    }
}
