
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        //String input = br.readLine();
        //int a = Integer.parseInt(br.readLine());

        boolean[] std = new boolean[31];  //

        for (int i = 0; i < 28; i++) {
            int num = Integer.parseInt(br.readLine());
            std[num] = true;
        }

        for (int i = 1; i <= 30; i++) {
            if (!std[i]) {
                System.out.println(i);
            }
        }

        br.close();
    }
}
