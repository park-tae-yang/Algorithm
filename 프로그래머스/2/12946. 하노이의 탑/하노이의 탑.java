import java.util.*;
class Solution {
    ArrayList<int[]> al;
        
    public int[][] solution(int n) {
        al = new ArrayList<>();
        rec(n,1,3,2);
        
        int[][] answer = new int[al.size()][2];
        
        for(int i = 0; i < al.size(); i++) {
            answer[i][0] = al.get(i)[0];
            answer[i][1] = al.get(i)[1];
        }
        return answer;
    }
    public void rec(int n,int from, int to, int via) {
        int[] move = {from,to};
        if(n == 1) {
            al.add(move);
            return;
        }
        rec(n-1,from,via,to);
        al.add(move);
        rec(n-1,via,to,from);
    }
}