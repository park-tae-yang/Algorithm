class Solution {
    public int solution(int a, int b) {
        String c = Integer.toString(a) + Integer.toString(b);
        return Math.max(Integer.parseInt(c), a * b * 2);
    }
}