class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        
        int n = nums.length;
        sub(n, nums, 0, ll, ans);
        return ans;
    }

    public void sub(int n, int[] nums, int idx, List<Integer> ll, List<List<Integer>> ans){
        ans.add(new ArrayList<>(ll));

        for(int i = idx; i < n; i++){
            if(i > idx && nums[i] == nums[i - 1]) continue;

            ll.add(nums[i]);
            sub(n, nums, i + 1, ll, ans);
            ll.remove(ll.size() - 1);
        }
    }
}