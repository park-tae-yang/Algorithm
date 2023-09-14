import java.util.stream.IntStream;
import java.util.*;

class Solution {
    public int solution(int n) {
        if(n % 2 == 0) return IntStream.range(0,n + 1).filter(i -> i % 2 == 0).map(i -> i * i).sum();
        return IntStream.range(0,n + 1).filter(i -> i % 2 != 0).sum();
    }
}