class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = (int) Math.ceil((double)num_list.length /(double) n);
        int[] answer = new int[len];
        for (int i = 0; i < len; i++) {
            answer[i] = num_list[i * n];
        }
        return answer;
    }
}