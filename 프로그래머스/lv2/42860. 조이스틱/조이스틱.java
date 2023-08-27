class Solution {
    public int solution(String name) {
        int answer = 0;
        int length = name.length();
        int index;
        int move = length - 1;
        for (int i = 0; i < length; i++) {
            int c = name.charAt(i) - 'A';
            if (c > 13) c = 26 - c;
            answer = answer + c;

            index = i + 1;
            while(index < length && name.charAt(index) == 'A'){
                index++;
            }
            move = Math.min(move, i * 2 + length - index);
            move = Math.min(move, (length - index) * 2 + i);
        }
        return answer + move;
    }
}