class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0, high = 0;
        for(int num : nums){
            low = Math.max(low, num);
            high += num;
        }

        while(low <= high){
            int mid = low + (high - low) / 2;

            int subarrays = countSubarrays(nums, mid);

            if(subarrays <= k) high = mid - 1;
            else low = mid + 1;
        }

        return low;
    }

    private int countSubarrays(int[] nums, int sum){
        int subarrays = 1, currentSum = 0;

        for(int num : nums){
            if(num + currentSum <= sum) currentSum += num;
            else{
                subarrays++;
                currentSum = num;
            }
        }

        return subarrays;
    }
}