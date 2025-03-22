public class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        // 최대공약수(GCD) 계산
        answer[0] = gcd(n, m);
        
        // 최소공배수(LCM) 계산
        answer[1] = n * m / answer[0];
        
        return answer;
    }
    
    // 유클리드 호제법을 사용한 GCD 계산 함수
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
