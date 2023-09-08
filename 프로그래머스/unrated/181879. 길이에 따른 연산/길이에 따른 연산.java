import java.util.*;
class Solution {
    public int solution(int[] num_list) {
        return num_list.length >= 11 ? Arrays.stream(num_list).sum() : Arrays.stream(num_list).reduce((x,y) -> x * y).orElse(0);
    }
}