class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int i = 0; i < queries.length; i++) {
            int c = queries[i][0];
            int d = queries[i][1];
            int a = arr[c];
            int b = arr[d];
            arr[d] = a;
            arr[c] = b;
        }
        return arr;
    }
}