import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String a = Long.toString(n);
        String[] arr = a.split("");
        String b = "";
        Arrays.sort(arr);
        for(int i = arr.length - 1; i >= 0; i--) {
            b += arr[i];
        }
        answer = Long.parseLong(b);
        return answer;
    }
}