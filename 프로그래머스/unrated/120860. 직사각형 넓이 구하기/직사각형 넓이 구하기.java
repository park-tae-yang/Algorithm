class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int x = 0;
        int y = 0;
        for(int i = 1; i < dots.length; i++) {
            if(dots[0][0] != dots[i][0]) {
                x = dots[i][0] - dots[0][0];
            }
            if(dots[0][1] != dots[i][1]) {
                y = dots[i][1] - dots[0][1];
            }
            answer = Math.abs(x) * Math.abs(y);
        }
        return answer;
    }
}