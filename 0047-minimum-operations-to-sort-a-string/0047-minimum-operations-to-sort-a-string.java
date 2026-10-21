class Solution {
    boolean isSorted(String s) {
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) < s.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public int minOperations(String s) {
        int n = s.length();

        if (isSorted(s)) return 0;
        if (n == 2) return -1;

        int min = s.charAt(0);
        int max = s.charAt(0);

        for (int i = 1; i < n; i++) {
            min = Math.min(min, s.charAt(i));
            max = Math.max(max, s.charAt(i));
        }

        if (s.charAt(0) == min || s.charAt(n - 1) == max) {
            return 1;
        }

        for (int i = 1; i < n - 1; i++) {
            if (s.charAt(i) == min || s.charAt(i) == max) {
                return 2;
            }
        }

        return 3;
    }
    // public int minOperations(String s) {
    //     int n = s.length();
    
    //     char min = 'z', max = 'a';
    //     boolean sorted = true;
    //     for(int i = 0; i < n; i++){
    //         min = (char) Math.min(min, s.charAt(i));
    //         max = (char) Math.max(max, s.charAt(i));
    //         if(i > 0 && s.charAt(i - 1) > s.charAt(i)) sorted = false;
    //     }

    //     if(sorted) return 0;

    //     if(n == 2) return -1;

    //     if(s.charAt(0) == min || s.charAt(n-1) == max) return 1;

    //     for(int i = 1; i < n - 1; i++){
    //         if(s.charAt(i) == min || s.charAt(i) == max) return 2;
    //     }

    //     return 3;
    // }
}