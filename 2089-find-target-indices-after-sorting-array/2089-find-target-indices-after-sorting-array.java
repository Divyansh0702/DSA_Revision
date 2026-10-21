class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        // Arrays.sort(nums);
        
        // List<Integer> res = new ArrayList<>();
        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] == target){
        //         res.add(i);
        //     }
        // }

        // return res;

        int small = 0, cnt = 0;
        List<Integer> res = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            if(nums[i] < target) small++;
            if(nums[i] == target) cnt++;
        }

        if(cnt == 0) return res;
        for(int i = 1; i <= cnt; i++) res.add(small++);

        return res;    
           
    }
}