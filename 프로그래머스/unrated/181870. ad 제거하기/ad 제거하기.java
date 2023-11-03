import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        return Arrays.stream(strArr).filter(i -> !i.contains("ad")).toArray(String[]::new);
    }
}