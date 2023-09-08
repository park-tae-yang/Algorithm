import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        answer = (int) (array.length / 2);
        return array[answer];
    }
}