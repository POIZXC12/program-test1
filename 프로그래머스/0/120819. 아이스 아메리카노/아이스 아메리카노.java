class Solution {
    public int[] solution(int money) {
        int ice_no = 5500;
        int max_no = money / ice_no;
        int min_no = money % ice_no;
        
        return new int[]{max_no, min_no};
    }
}