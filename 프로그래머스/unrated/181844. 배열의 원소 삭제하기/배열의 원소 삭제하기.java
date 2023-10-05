import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        for(int i = 0; i < delete_list.length; i++) {
            final int j = i;
            arr = Arrays.stream(arr).filter(item -> item != delete_list[j]).toArray();
        }
        return arr;
    }
}