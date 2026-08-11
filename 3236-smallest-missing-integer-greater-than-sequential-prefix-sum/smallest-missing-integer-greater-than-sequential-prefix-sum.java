class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        int j = 1;
        while (j < nums.length && nums[j] == nums[j - 1] + 1) {
            sum += nums[j];
            j++;
        }
        
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        while(set.contains(sum))sum++;
        
        return sum;
    }
}