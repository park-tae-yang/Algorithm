import java.util.*;
class Solution {
    static int[] parent;
    
    public int solution(int n,int[][] costs) {
        int answer = 0;
        Arrays.sort(costs, (int[] i1, int[] i2) -> i1[2] - i2[2]);
        parent = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }

        for (int[] cost : costs) {
            int i1 = findPrent(cost[0]);
            int i2 = findPrent(cost[1]);

            if (i1 == i2) continue;

            answer += cost[2];
            parent[i2] = i1;
        }
        return answer;
    }

    private int findPrent(int node) {
        if(parent[node] == node) return node;
        return parent[node] = findPrent(parent[node]);
    }
}