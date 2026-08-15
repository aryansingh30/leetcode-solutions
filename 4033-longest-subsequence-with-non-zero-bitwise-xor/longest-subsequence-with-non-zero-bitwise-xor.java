class Solution {
    public int longestSubsequence(int[] nums) {
        int totalXor = 0;
        boolean hasNonZero = false;
        for (int i:nums){
            totalXor ^=i;
            if(i!=0)hasNonZero = true;

        }
        if(totalXor!=0)return nums.length;
        if(hasNonZero)return nums.length-1;
        return 0;

    }
}