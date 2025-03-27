class Solution {
    public int[] solution(long n) {
        String s = String.valueOf(n);
        int[] answer = new int[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            answer[i] = Character.getNumericValue(s.charAt(s.length() - 1 - i));
        }
        
        return answer;
    }
}
