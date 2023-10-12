import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        for(int i = 0; i <= citations.length; i++) {
            final int fi = i ;
            answer = fi;
            if(Arrays.stream(citations).filter(item -> item >= fi).count() < fi)
                return fi - 1;
        }
        return answer;
    }
}