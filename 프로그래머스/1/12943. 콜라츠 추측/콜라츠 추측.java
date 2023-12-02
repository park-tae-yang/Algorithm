class Solution {
    public int solution(int num) {
        int answer = 0;
        long bigNum = num;
        for(int i = 0; i < 500; i++) {
            
            if(bigNum == 1) {
                return answer;
            }
            
            if(bigNum % 2 == 0) {
                bigNum /= 2;
            } else {
                bigNum = (bigNum * 3) + 1;
            }
            answer++;
        }
        return -1;
    }
}