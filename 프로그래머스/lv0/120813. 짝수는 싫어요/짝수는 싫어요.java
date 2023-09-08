import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> li = new ArrayList<>();
        for(int i = 1; i <= n; i+=2) {
            li.add(i);
        }
        answer = li.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}