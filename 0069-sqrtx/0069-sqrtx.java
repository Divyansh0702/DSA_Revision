class Solution {
    public int mySqrt(int x) {
        if(x < 2) return x;

        int low = 1, high = x / 2;
        
        while(low <= high){
            long mid = low + (high - low) / 2;

            if(mid * mid <= x) low = (int)mid + 1;
            else  high = (int)mid - 1;
        }

        return high;
    }
}