
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader라는 매서드(함수)에서 새로운 객체 생성 (br이라는 이름의 입력 함수를 만듦)
        // 쉽게 생각하면 br이라는 입력받는 기계를 만든거임
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //띄어쓰기로 입력받았을때 띄어쓰기를 기준으로 나눠주는 착한 아이
        //StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a= Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        System.out.println(a*b);



    }
}