class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0, best=0;
        for(int i: nums) {
            if(i!=1) {
                best = Math.max(best, count);
                count=0;                
            } else count++;
        }
        best = Math.max(best, count);
        return best;
    }
}