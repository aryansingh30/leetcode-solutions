class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int l =0;
        int maxlen = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for(int r=0;r<nums.length;r++){
            map.merge(nums[r], 1, Integer::sum);

            while(map.get(nums[r])>k){
                map.merge(nums[l], -1, Integer::sum);
                l++;
            }
            maxlen = Math.max(maxlen, r-l+1);
        }
        return maxlen;
    }
}