class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        int max = 0;
        for(int i = 1; i <= 9; i++) {
            max += i;
        }
        for(int num : numbers) {
            max -= num;
        }
        answer = max;
        return answer;
    }
}