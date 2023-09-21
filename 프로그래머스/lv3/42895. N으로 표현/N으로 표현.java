import java.util.*;
class Solution {
    public int solution(int N, int number) {
        List<Set<Integer>> idxList = new ArrayList<>();
        for(int i=0; i<9; i++) idxList.add(new HashSet<>());
        idxList.get(1).add(N);
        for (int i = 2; i < 9; i++) {
            Set<Integer> idxSet = idxList.get(i);
            for (int j = 1; j < i; j++) {
                Set<Integer> jSet = idxList.get(j);
                Set<Integer> iSet = idxList.get(i-j);
                for (int jNum: jSet) {
                    for (int iNum : iSet) {
                        idxSet.add(jNum + iNum);
                        idxSet.add(jNum - iNum);
                        idxSet.add(jNum * iNum);

                        if (jNum != 0 && iNum != 0) {
                            idxSet.add(jNum / iNum);
                        }
                    }
                }
                idxSet.add(Integer.parseInt(String.valueOf(N).repeat(i)));
            }
            for (Set<Integer> idx : idxList) {
                if (idx.contains(number)) {
                    return idxList.indexOf(idx);
                }
            }
        }
        return -1;
    }
}