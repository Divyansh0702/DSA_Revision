class Solution {
    public void nextPermutation(int[] nums) {
        int p = -1, q = -1;

        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] < nums[i + 1]){
                p = i;
                break;
            }
        }

        if(p == -1){
            revRange(nums, 0, nums.length - 1);
            return;
        }

        for(int i = nums.length - 1; i > p; i--){
            if(nums[i] > nums[p]){
                q = i;
                break;
            }
        }

        int temp = nums[p];
        nums[p] = nums[q];
        nums[q] = temp;

        revRange(nums, p + 1, nums.length - 1);
    }

    public void revRange(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}   