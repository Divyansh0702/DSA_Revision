class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long required = (long)m * k;
        if(required > bloomDay.length) return -1;

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for(int day : bloomDay){
            low = Math.min(day, low);
            high = Math.max(day, high);
        }

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(isPossible(bloomDay, m, k, mid)) high = mid - 1;
            else low = mid + 1;
        }

        return low;
    }

    private boolean isPossible(int[] bloomDay, int m, int k, int day){
        int flowers = 0, bouquets = 0;

        for(int bloom : bloomDay){
            if(bloom <= day) flowers++;
            else{
                bouquets += flowers / k;
                flowers = 0;
            }
        }
        bouquets += flowers / k;

        return bouquets >= m;
    }

}