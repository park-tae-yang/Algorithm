import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        Set<Integer> set = new HashSet();
        int min = 100;
        int len = wires.length;
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                if(i == j) {
                    continue;
                }
                set.add(wires[j][0]);
                set.add(wires[j][1]);
                for(int k = 0; k < len; k++) {
                    for(int l = 0; l < len; l++) {
                        if(l == i) {
                            continue;
                        }
                        if(set.contains(wires[l][0]) || set.contains(wires[l][1])) {
                            set.add(wires[l][0]);
                            set.add(wires[l][1]);
                        }
                    }
                }
                int abs = Math.abs((n - set.size()) - set.size());
                min = Math.min(min,abs);
                set.clear();
            }
        }
        if(min == 100) {
            return 0;
        }
        return min;
    }
}