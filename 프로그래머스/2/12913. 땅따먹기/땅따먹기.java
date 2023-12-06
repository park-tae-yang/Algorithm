class Solution {
    int solution(int[][] land) {
        int answer = 0;
        int len = land.length;

        int[][] mem = new int[len + 1][4];

        for (int i = 1; i <= len; i++) {

            for (int j = 0; j < 4; j++) {

                for (int k = 0; k < 4; k++) {
                    if (j == k) {
                        continue;
                    }
                    mem[i][j] = Math.max(mem[i][j], land[i - 1][j] + mem[i - 1][k]);

                    answer = Math.max(answer,mem[i][j]);
                }

            }

        }
        return answer;
    }
}