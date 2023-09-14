class Solution {
    public int[] solution(int[] arr, int n) {
        int eo = arr.length % 2 == 0 ? 1 : 0;
        for(int i = 0; i < arr.length; i++) {
            if(i % 2 == eo) {
                arr[i] = arr[i] + n;
            }
        }
        return arr;
    }
}