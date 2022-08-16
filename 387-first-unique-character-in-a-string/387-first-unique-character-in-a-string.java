class Solution {
    public int firstUniqChar(String s) {
        int[] h = new int[26];
        int l = s.length();
        for(int i=0; i<l; i++) 
            h[s.charAt(i)-97]++;
        
        
        for(int i=0; i<l; i++) {
            if(h[s.charAt(i)-97] == 1) {
               return i;
            }
        }
        return -1;
    }
}