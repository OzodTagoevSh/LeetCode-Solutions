class Solution {
    public boolean isHappy(int n) {
        if(n == 1 || n == 7) return true;
        while(n / 10 != 0) {
            int helper = n;
            n = 0;
            while(helper != 0) {
                int digit = helper % 10;
                n += digit * digit;
                helper /= 10;
            }
        }
        return n == 1 || n == 7;
    }
}