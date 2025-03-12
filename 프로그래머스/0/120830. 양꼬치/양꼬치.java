class Solution {
    public int solution(int n, int k) {
        int yang_price = 12000 * n;
        //양꼬치 가격
        int drink = 2000 * k;
        // 음료수 가격
        int service_drink = n/10;
        //서비스 음료수 10인분당 하나 공짜
        
        int answer = yang_price + (drink - (service_drink * 2000));
        
        return answer;
    }
}