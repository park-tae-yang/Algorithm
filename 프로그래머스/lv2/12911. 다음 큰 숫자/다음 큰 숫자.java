class Solution {
    public int solution(int n) {
        int answer = n;
        int len = Integer.toBinaryString(n).replace("0","").length();
        while(true) {
            answer++;
            if(Integer.toBinaryString(answer).replace("0","").length() == len) break;
        }
        return answer;
    }
}