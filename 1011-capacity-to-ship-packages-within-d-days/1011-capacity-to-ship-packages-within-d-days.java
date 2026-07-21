class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0, high = 0;

        for(int weight : weights){
            low = Math.max(low, weight);
            high += weight;
        }

        while(low <= high){
            int mid = low + (high - low) / 2;

            int totalWeight = 0, d = 0;
            for(int weight : weights){

                if(totalWeight + weight <= mid) totalWeight += weight;
                else{
                    d++;
                    totalWeight = weight;
                }
            }
            d++;

            if(d <= days) high = mid - 1;
            else low = mid + 1;
        }

        return low;
    }
}