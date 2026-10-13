class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        
        for(int i = 0; i < n; i++){
            nums[i] = nums[i] * nums[i];    
        }

        Arrays.sort(nums);

        int negatives = n / 2;

        long score = 0;
        for(int i = 0; i < negatives; i++){
            score -= nums[i];
        }

        for(int i = negatives; i < nums.length; i++){
            score += nums[i];
        }

        return score;
    }
}