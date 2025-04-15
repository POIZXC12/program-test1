import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        for(int i = 0;i<sizes.length;i++){
            Arrays.sort(sizes[i]);
        }
        int xMin = -1;
        int yMin = -1;
        for(int i=0;i<sizes.length;i++){
            xMin = Math.max(xMin, sizes[i][0]);
            yMin = Math.max(yMin, sizes[i][1]);
        }
        return(xMin * yMin);
    }
}