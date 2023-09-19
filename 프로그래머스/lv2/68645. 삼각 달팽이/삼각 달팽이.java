import java.util.*;
class Solution {
    public int[] solution(int n) {
        int max = 0;
        for(int i = 1; i <= n; i++) max += i;
        int[] answer = new int[max];
        int[][] coord = new int[n][n];
        int x = -1;
        int y = 0;
        int num = 1;
        
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                if(i % 3 == 0) x++;
                else if(i % 3 == 1) y++;
                else if(i % 3 == 2) {
                    x--;
                    y--;
                }
                coord[x][y] = num;
                num++;
            }
        }
        
        int idx = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(coord[i][j] == 0) break;
                answer[idx] = coord[i][j];
                idx++;
            }
        }
        
        return answer;
    }
}