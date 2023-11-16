import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        my_string = my_string.replaceAll("[a-z]", "");
        int[] answer = new int[my_string.length()];
        char[] split = my_string.toCharArray();
        Arrays.sort(split);
        for(int i = 0; i < answer.length; i++) {
            answer[i] = split[i] - '0';
        }
        return answer;
    }
}