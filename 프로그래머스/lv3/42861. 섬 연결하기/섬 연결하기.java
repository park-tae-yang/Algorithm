import java.util.*;
class Solution {

    public int solution(int n,int[][] costs) {
        int answer = 0;
        Arrays.sort(costs,(int[] a1, int[] a2) -> a1[2] - a2[2]);
        Set<Integer> island = new HashSet<>();
        island.add(costs[0][0]);

        while (island.size() < n) {
            for(int[] cost: costs) {
                if (island.contains(cost[0]) && island.contains(cost[1])) continue;
                if (island.contains(cost[0]) || island.contains(cost[1])) {
                    island.add(cost[0]);
                    island.add(cost[1]);
                    answer += cost[2];
                    break;
                }
            }
        }

        return answer;
    }
}