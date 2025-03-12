import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int[] arr = new int[num_list.length];
        
        
        for (int i = 0; i < num_list.length; i++) {
            arr[arr.length - 1 - i] = num_list[i];
        }
        return arr;
    }
}