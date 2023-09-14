class Solution {
    public int[] solution(int[] num_list) {
        int leng = num_list.length;
        int[] answer = new int[leng + 1];
        for(int i = 0; i < leng; i++) {
            answer[i] = num_list[i];
        }
        answer[leng] = num_list[leng - 1] > num_list[leng - 2] ? num_list[leng - 1] - num_list[leng - 2] : num_list[leng - 1] * 2;
        return answer;
    }
}