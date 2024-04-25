import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> al = new ArrayList<>();
        Arrays.sort(arr);
        for(int num : arr) {
            if(num % divisor == 0) {
                al.add(num);
            }
        }
        answer = al.stream().mapToInt(i -> i).toArray();
        if(answer.length == 0) return new int[]{-1};
        return answer;
    }
}