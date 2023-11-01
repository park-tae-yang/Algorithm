class Solution {
    public int solution(int[] box, int n) {
        if(box[0] < n || box[1] < n || box[2] < n ) return 0;
        return (box[0] / n) * (box[1] / n) * (box[1] / n);
    }
}