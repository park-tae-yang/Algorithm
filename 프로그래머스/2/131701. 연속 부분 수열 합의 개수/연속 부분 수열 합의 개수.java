import java.util.*;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for(int item : elements) {
            set.add(item);
            sum += item;
        }
        set.add(sum);
        int len = elements.length;
        
        for(int i = 2; i < len; i++) {
            for(int j = 0; j < len; j++ ) {
                int num = 0;
                for(int k = j; k < j+i; k++) {
                    num += elements[k % len];
                }
                set.add(num);
            }
        }
        return set.size();
    }
}