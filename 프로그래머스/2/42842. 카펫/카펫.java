class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int area = (brown + 4) / 2;
        for(int x = 1; x < area; x++) {
            int y = area - x;
            if(x * y == brown + yellow) {
                answer[0] = y;
                answer[1] = x;
                break;
            }
        }
        return answer;
    }
}