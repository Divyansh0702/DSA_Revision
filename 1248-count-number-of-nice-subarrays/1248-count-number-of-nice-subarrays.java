class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int oddCnt = 0, cnt = 0;
        for(int num : nums){
            if(num % 2 == 1) oddCnt++;
            
            if(map.containsKey(oddCnt - k)){
                cnt += map.get(oddCnt - k);             
            }

            map.put(oddCnt, map.getOrDefault(oddCnt, 0) + 1);
        }

        return cnt;
    }
}