class Solution {
    static int tar;
    static int[] nums;
    static int answer;
    public int solution(int[] numbers, int target) {
        tar = target;
        nums = numbers;
        dfs(0,0);
        return answer;
    }
    
    public void dfs(int depth, int now) {
        if(depth == nums.length) {
            if(now == tar) answer++;
            return;
        }
        
        dfs(depth + 1 , now + nums[depth]);
        
        dfs(depth + 1 , now - nums[depth]);
        
        
    }
}