class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{first(nums, target), last(nums, target)};
    }

    public int first(int[] nums, int x){
        int low = 0, high = nums.length - 1;
        
        int first = -1;
        while(low <= high){
            int mid = low + (high - low) / 2;

            if(nums[mid] == x) first = mid;

            if(nums[mid] >= x) high = mid - 1;
            else low = mid + 1;
        }
        
        return first;
    }

    public int last(int[] nums, int x){
        int low = 0, high = nums.length - 1;
        
        int last = -1;
        while(low <= high){
            int mid = low + (high - low) / 2;

            if(nums[mid] == x) last = mid;

            if(nums[mid] <= x) low = mid + 1;
            else high = mid - 1;
        }

        return last;
    }
}