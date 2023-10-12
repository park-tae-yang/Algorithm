import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        for(int i = 0; i < discount.length; i++) {
            for(int j = 0; j < want.length; j++) {
                if(discount[i].equals(want[j])) number[j]--;
                if(i >= 10) if(discount[i - 10].equals(want[j])) number[j]++;
            }
            answer += Arrays.stream(number).allMatch(item -> item == 0) ? 1 : 0;
        }
        return answer;
    }
}