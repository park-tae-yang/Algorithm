import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 1;
        Arrays.sort(sides);
        int max = sides[0] + sides[1] - 1;
        for(int i = sides[1] - sides[0] + 1; i < max; i++) {
            answer++;
        }
        return answer;
    }
}