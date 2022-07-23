class Solution {
    public int myAtoi(String s) {
        double sum = 0;
        s = s.trim();
        int len = s.length(); 
        if(len < 1) return 0;
        boolean sign = false;
        int i=0;
        if(s.charAt(0) == '-' || s.charAt(0) == '+') {
            if(s.charAt(0) == '-') sign = true;
            i++;
        } 
        for(; i<len; i++) {
            char ele = s.charAt(i);
            if(Character.isDigit(ele)) {
                sum = 10*sum + (ele-48);
            } else break;            
        }
        System.out.println(sum);
        if(sign) sum = -sum;
        if(Integer.MAX_VALUE < sum) sum = Integer.MAX_VALUE;
        if(Integer.MIN_VALUE > sum) sum = Integer.MIN_VALUE; 
        System.out.println(sum);
        return (int)sum;
    }
}