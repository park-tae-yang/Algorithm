class Solution {
    public int solution(int[] num_list) {
        int sum = num_list[0];
        int multi = num_list[0];
        for(int i = 1; i < num_list.length; i++) {
            sum += num_list[i];
            multi *= num_list[i];
        }
        sum = (int)Math.pow(sum,2);
        return multi < sum ? 1 : 0;
    }
}