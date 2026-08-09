class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int m = g.length, n = s.length;
        int l = 0, r = 0;
        while(l < n && r < m){
            if(s[l] >= g[r]) r++;
            l++;
        }

        return r;
    }
}