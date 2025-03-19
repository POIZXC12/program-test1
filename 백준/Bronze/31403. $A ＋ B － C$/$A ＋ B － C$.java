
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader라는 매서드(함수)에서 새로운 객체 생성 (br이라는 이름의 입력 함수를 만듦)
        // 쉽게 생각하면 br이라는 입력받는 기계를 만든거임
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String A  = br.readLine();
        String B  = br.readLine();
        String C  = br.readLine();

        int answer_1 = Integer.parseInt(A) + Integer.parseInt(B) - Integer.parseInt(C);

        int answer_2 = Integer.parseInt(A + B) - Integer.parseInt(C);

        System.out.println(answer_1);
        System.out.print(answer_2);

    }
}