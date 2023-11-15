import java.util.*;

class Solution {
    static int sum;
    boolean[][] isVisit;
    
    public int[] solution(String[] maps) {
        int[] answer = {};
        int[] x = {-1};
        sum = 0;
        int len = maps.length;
        isVisit = new boolean[len][maps[0].length()];
        List<Integer> foods = new ArrayList<>();
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < maps[0].length(); j++) {
                if(maps[i].charAt(j) == 'X' || isVisit[i][j]) {
                    continue;
                }
                island(i,j,maps);
                foods.add(sum);
                sum = 0;
            }
        }
        if(foods.isEmpty()) return x;
        
        answer = foods.stream().mapToInt(i -> i).toArray();
        Arrays.sort(answer);
        return answer;
    }
    
    public void island(int x, int y,String[] maps) {
        if(maps[x].charAt(y) == 'X' || isVisit[x][y]) {
            return;
        }
        
        sum += maps[x].charAt(y) - '0';
        isVisit[x][y] = true;
        
        if(x != 0) island(x - 1 , y , maps);
        
        if(x != maps.length - 1) island(x + 1 , y , maps);
        
        if(y != 0) island(x , y - 1 , maps);
        
        if(y != maps[x].length() - 1) island(x , y + 1 , maps);
        
        
    }
}