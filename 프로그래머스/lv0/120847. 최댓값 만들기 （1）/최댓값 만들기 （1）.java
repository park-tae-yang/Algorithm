import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int l = numbers.length;
        numbers = Arrays.stream(numbers).sorted().toArray();
        return numbers[l - 1] * numbers[l - 2];
    }
}