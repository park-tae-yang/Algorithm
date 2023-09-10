class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int i = 0; i < queries.length; i++) {
            int c = queries[i][0];
            int d = queries[i][1];
            int a = arr[queries[i][0]];
            int b = arr[queries[i][1]];
            arr[d] = a;
            arr[c] = b;
        }
        return arr;
    }
}