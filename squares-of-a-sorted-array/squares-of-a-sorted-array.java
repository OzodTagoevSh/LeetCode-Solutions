class Solution {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        for(int i=0; i<len; i++) {
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}