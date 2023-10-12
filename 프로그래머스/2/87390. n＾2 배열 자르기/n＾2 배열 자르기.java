import java.util.*;
class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right + 1 - left)];
        int idx = 0;
        for (long i = left; i <= right; i++) {
            int num = (int)Math.max(i % n, i / n);
            answer[idx] = num + 1;
            idx++;
        }
        return answer;
    }
}