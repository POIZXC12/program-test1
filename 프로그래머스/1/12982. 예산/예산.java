import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        
        // 배열을 오름차순으로 정렬
        Arrays.sort(d);
        
        // 정렬된 배열을 순회하면서 예산을 분배
        for (int i = 0; i < d.length; i++) {
            sum += d[i];
            
            // 누적 합이 예산을 초과하면 반복문 종료
            if (sum > budget) {
                break;
            }
            
            answer++;
        }
        
        return answer;
    }
}
