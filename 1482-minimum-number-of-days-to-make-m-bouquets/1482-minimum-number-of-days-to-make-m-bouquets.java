class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long required = (long) m * k;
        if(bloomDay.length < required) return -1;

        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;
        for(int i : bloomDay){
            low = Math.min(low, i);
            high = Math.max(high, i);
        }

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(canMake(bloomDay, mid, m, k)) high = mid - 1;
            else low = mid + 1;
        }
        return low;
    }

    public boolean canMake(int[] bloomDay, int mid, int m, int k){
        int flowers = 0, bouquets = 0;
        for(int day : bloomDay){
            if(day <= mid) flowers++;
            else{
                bouquets += flowers / k;
                flowers = 0;
            }
        }
        bouquets += flowers / k;

        return bouquets >= m;
    }
}