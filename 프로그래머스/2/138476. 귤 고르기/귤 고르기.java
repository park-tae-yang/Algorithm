import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int num = 0;
        Arrays.sort(tangerine);
        int[] weight = new int[tangerine[tangerine.length - 1] + 1];
        for(int item : tangerine) {
            weight[item]++;
        }
        
        Arrays.sort(weight);
        
        for(int i = weight.length - 1; i >= 0; i--) {
            num += weight[i];
            answer++;
            if(num >= k) return answer;
        }
        return -1;
    }
}