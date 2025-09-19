
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //String input = br.readLine();
        //int a = Integer.parseInt(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int minSum = 0;
        int maxSum = 0;

        int tempA = A;
        int tempB = B;
        int index = 1;

        while(tempA > 0 || tempB > 0) {
            if(tempA % 10 == 5 || tempA % 10 == 6) {
                minSum += 5 * index;
                maxSum += 6 * index;
            } else {
                minSum += tempA % 10 * index;
                maxSum += tempA % 10 * index;
            }
            if(tempB % 10 == 5 || tempB % 10 == 6) {
                minSum += 5 * index;
                maxSum += 6 * index;
            } else {
                minSum += tempB % 10 * index;
                maxSum += tempB % 10 * index;
            }
            index *= 10;
            tempA = tempA / 10;
            tempB = tempB / 10;
        }
        System.out.println(minSum + " " + maxSum);

    }
}