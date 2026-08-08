class Solution {
    public boolean canJump(int[] nums) {
        int[] dp = new int[nums.length];
        // return jump(nums, 0);
        return jump(nums, 0, dp);
    }

    private boolean jump(int[] nums, int idx){
        if(idx >= nums.length - 1) return true;

        for(int i = 1; i <= nums[idx]; i++){
            if(jump(nums, i + idx)) return true;
        }

        return false;
    }

    private boolean jump(int[] nums, int idx, int[] dp){
        if(idx >= nums.length - 1) return true;

        if(dp[idx] != 0) return dp[idx] == 1;

        for(int i = 1; i <= nums[idx]; i++){
            if(jump(nums, idx + i, dp)){
                dp[idx] = 1;
                return true;
            }
        }

        dp[idx] = -1;
        return false;
    }
}