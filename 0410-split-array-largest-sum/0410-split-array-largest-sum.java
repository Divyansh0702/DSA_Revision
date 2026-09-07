class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0, high = 0;
        for(int num : nums){
            low = Math.max(low, num);
            high += num;
        }

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(canSplit(nums, mid, k)) high = mid - 1;
            else low = mid + 1;
        }
        return low;
    }

    public boolean canSplit(int[] nums, int mid, int k){
            int subarrays = 1, sum = 0;
            for(int num : nums){
                if(sum + num <= mid) sum += num;
                else{
                    subarrays++;
                    sum = num;
                }
            }

            return subarrays <= k;
        }
}