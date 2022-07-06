class Solution {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int left = 0, right = len-1;
        int[] res = new int[len];
        for(int i=len-1; i>=0; i--) {
            if(Math.abs(nums[left]) > Math.abs(nums[right])) {
                res[i] = nums[left]*nums[left++];
            } else {
                res[i] = nums[right]*nums[right--];
            }
        }
        
        return res;
    }
}