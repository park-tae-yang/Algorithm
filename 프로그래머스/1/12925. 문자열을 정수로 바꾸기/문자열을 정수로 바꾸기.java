class Solution {
    public int solution(String str) {
        int answer = 0;
        
        if (str.charAt(0) == '-') {
            str = str.substring(1);
            answer = -1 * Integer.parseInt(str);
            return answer;
        } else if (str.charAt(0) == '+') {
            str = str.substring(1);
            answer = Integer.parseInt(str);
            return answer;
        } else {
            return Integer.parseInt(str);
        }
    }
}