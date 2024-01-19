import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList();
        list.add(n);
        while(n != 1) {
            if(n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
            list.add(n);
            
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}