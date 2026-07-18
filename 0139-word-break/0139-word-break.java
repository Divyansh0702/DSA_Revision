class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        // Set<String> set = new HashSet<>(wordDict);
        // return WB(s, 0, set);

        Set<String> set = new HashSet<>(wordDict);

        int[] dp = new int[s.length()];
        Arrays.fill(dp, -1);

        return solve(s, 0, set, dp);
    }

    // public boolean WB(String s, int idx, Set<String> set){
    //     if(idx == s.length()) return true;

    //     for(int i = idx; i < s.length(); i++){
    //         String str = s.substring(idx, i + 1);

    //         if(set.contains(str)){
    //             if(WB(s, i + 1, set)) return true;
    //         }
    //     }

    //     return false;
    // }

    public boolean solve(String s, int idx, Set<String> set, int[] dp) {

        if (idx == s.length()) {
            return true;
        }

        if (dp[idx] != -1) return dp[idx] == 1;

        for (int i = idx; i < s.length(); i++) {

            String str = s.substring(idx, i + 1);

            if (set.contains(str)) {

                if (solve(s, i + 1, set, dp)) {
                    dp[idx] = 1;
                    return true;
                }
            }
        }

        dp[idx] = 0;
        return false;
    }
}