import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        loop: while(true) {
            answer += max;
            for(int num : arr) {
                if(answer % num != 0) {
                    continue loop;
                }
            }
        return answer;
        }
    }
}