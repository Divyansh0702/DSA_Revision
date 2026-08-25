class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        
        int n = intervals.length;
        int[][] ans = new int[n][2];
        int k = 0;
        
        for(int i = 0; i < n; i++){
            if(k == 0 || intervals[i][0] > ans[k - 1][1]){
                ans[k][0] = intervals[i][0];
                ans[k][1] = intervals[i][1];
                k++;
            }
            else{
                ans[k - 1][1] = Math.max(ans[k - 1][1], intervals[i][1]);
            }
        }
        return Arrays.copyOf(ans, k);
    }
}