
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader라는 매서드(함수)에서 새로운 객체 생성 (br이라는 이름의 입력 함수를 만듦)
        // 쉽게 생각하면 br이라는 입력받는 기계를 만든거임
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //띄어쓰기로 입력받았을때 띄어쓰기를 기준으로 나눠주는 착한 아이
        //StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}