class Solution {
    public int[] solution(int[] prices) {
        int len = prices.length;
        int[] answer = new int[len];
        for(int i = 0; i < len; i++) {
            int sum = 0;
            for(int j = i + 1; j < len; j++) {
                sum++;
                if(prices[i] > prices[j]) {
                    break;
                }
            }
            answer[i] = sum;
        }
        return answer;
    }
}