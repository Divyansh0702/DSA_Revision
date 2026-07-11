class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(candidates);
        combSum2(candidates, target, 0, ll, ans);
        return ans;
    }

    private void combSum2(int[] arr, int k, int idx, List<Integer> ll, List<List<Integer>> ans){
        if(k == 0){
            ans.add(new ArrayList<>(ll));
            return;
        }

        for(int i = idx; i < arr.length; i++){
            if(i > idx && arr[i] == arr[i - 1]) continue;

            if(k >= arr[i]){
                ll.add(arr[i]);
                combSum2(arr, k - arr[i], i + 1, ll, ans);
                ll.remove(ll.size() - 1);
            }
        }
    }
}