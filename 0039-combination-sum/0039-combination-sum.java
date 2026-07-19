class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        combSum(candidates, target, 0, ll, ans);
        return ans;
    }

    public void combSum(int[] candidates, int target, int idx, List<Integer> ll, List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(ll));
            return;
        }

        for(int i = idx; i < candidates.length; i++){
            if(target >= candidates[i]){
                ll.add(candidates[i]);
                combSum(candidates, target - candidates[i], i, ll, ans);
                ll.remove(ll.size() - 1);
            }
        }
    }
}