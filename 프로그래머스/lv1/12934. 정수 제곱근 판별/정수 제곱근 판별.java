class Solution {
    public long solution(long n) {
        long answer = 0;
        double sqrt = Math.sqrt(n);
        if(sqrt == (int) sqrt) answer = (long)Math.pow(sqrt + 1,2);
        else answer = -1;
        return answer;
    }
}