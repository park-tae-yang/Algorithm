class Solution {
    public int solution(int a, int b) {
        if(a % 2 == 1 && b % 2 == 1) return (int) Math.pow(a,2) + (int) Math.pow(b,2);
        if(a % 2 == 1 || b % 2 == 1) return (a + b) * 2;
        return Math.abs(a - b);
    }
}