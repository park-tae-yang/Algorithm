import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        int len = friends.length;
        int[][] chart = new int[len][len];
        int[] gift = new int[len];
        int[] score = new int[len];
        
        for(int i = 0; i < gifts.length; i++) {
            int a = -1;
            int b = -1;
            String[] part = gifts[i].split(" ");
            for(int j = 0; j < len; j++) {
                if(part[0].equals(friends[j])) {
                    a = j;
                }
                if(part[1].equals(friends[j])) {
                    b = j;
                }
            }
            chart[a][b]++;
        }
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                if(i == j) continue;
                score[i] += chart[i][j];
                score[j] -= chart[i][j];
            }
        }
        
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                if(i == j) continue;
                if(chart[i][j] > chart[j][i]) {
                    gift[i]++;
                }else if(chart[i][j] == chart[j][i] && score[i] > score[j]) {
                    gift[i]++;
                }
            }
        }
        Arrays.sort(gift);
        answer = gift[gift.length - 1];
        
        return answer;
    }
}