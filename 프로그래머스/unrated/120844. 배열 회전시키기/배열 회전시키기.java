class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        boolean right = direction.equals("right") ? true : false;
        if(right) {
            answer[0] = numbers[numbers.length - 1];
        } else {
            answer[answer.length - 1] = numbers[0];
        }
        
        for(int i = 0; i < numbers.length - 1; i++) {
            if(right) {
                answer[i + 1] = numbers[i];
            } else {
                answer [i] = numbers[i + 1];
            }
        }
        return answer;
    }
}