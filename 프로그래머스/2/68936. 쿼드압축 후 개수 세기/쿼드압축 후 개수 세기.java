import java.util.*;

class Solution {
    static int[][] narr;
    int[] answer;
    public int[] solution(int[][] arr) {
        narr = arr;
        answer = new int[2];
        rec(0,0,arr.length);
        return answer;
    }
    public void rec(int x, int y, int n) {
        if (n == 1) {
            answer[narr[x][y]]++;
            return;
        }
        int[] array = new int[n*n];
        int idx = 0;
        for (int i = x; i < x + n; i++) {
            for (int j = y; j < y + n; j++) {
                array[idx] = narr[i][j];
                idx++;
            }
        }
        if (Arrays.stream(array).allMatch(i -> i == 1)) {
            answer[1]++;
            return;
        } else if (Arrays.stream(array).allMatch(i -> i == 0)) {
            answer[0]++;
            return;
        }
        n = n / 2;
        rec(x,y,n);
        rec(x + n,y,n);
        rec(x,y+n,n);
        rec(x + n, y + n,n);
    }
}