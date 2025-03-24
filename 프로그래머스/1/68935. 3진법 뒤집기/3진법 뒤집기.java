class Solution {
    public int solution(int n) {
        // 1. 10진법 -> 3진법으로 변환 및 뒤집기
        String ternary = "";
        while (n > 0) {
            ternary = (n % 3) + ternary;
            n /= 3;
        }
        
        // 2. 뒤집힌 3진법 -> 10진법으로 변환
        int answer = 0;
        int power = 1;
        for (int i = 0; i < ternary.length(); i++) {
            answer += (ternary.charAt(i) - '0') * power;
            power *= 3;
        }
        
        return answer;
    }
}
