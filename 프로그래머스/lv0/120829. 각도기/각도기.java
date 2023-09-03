class Solution {
    public int solution(int angle) {
        int answer = 4;
        if (angle < 90) return 1;
        if (angle == 90) return 2;
        if (angle < 180) return 3;
        return answer;
    }
}