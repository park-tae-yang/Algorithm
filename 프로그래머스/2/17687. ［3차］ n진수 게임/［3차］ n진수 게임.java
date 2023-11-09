class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        int idx = 1;
        String str = "0";
        while(str.length() < t * m) {
            str += Integer.toString(idx,n);
            idx++;
        }
        for(int i = p - 1; i < t * m; i += m) {
            answer += str.charAt(i);
        }
        return answer.toUpperCase();
    }
}