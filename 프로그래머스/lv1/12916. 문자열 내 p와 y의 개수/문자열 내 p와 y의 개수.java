class Solution {
    boolean solution(String s) {
        boolean answer = false;
        s = s.toLowerCase();
        int p = 0;
        int y = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'p') p++;
            else if(s.charAt(i) == 'y') y++;
        }
        if (p == y) answer = true;
        return answer;
    }
}