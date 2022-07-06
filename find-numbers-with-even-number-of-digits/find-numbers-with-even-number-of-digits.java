class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int ele: nums) {
            int digitCount = (int)Math.log10(ele)+1;
            if(digitCount%2==0) count++;
        }
        return count;
    }
}