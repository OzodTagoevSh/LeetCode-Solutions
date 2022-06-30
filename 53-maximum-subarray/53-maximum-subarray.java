class Solution {
    public int maxSubArray(int[] nums) {
        int best=Integer.MIN_VALUE, sum=0, len=nums.length;
        for(int i=0; i<len; i++) {
            sum = Math.max(nums[i], sum+nums[i]);
            best = Math.max(best, sum);            
        }
        return best;
    }
}