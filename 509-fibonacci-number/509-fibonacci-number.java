class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        if(n==2) return 1;
        int f1 = 1;
        int f2 = 1;
        int fn = 2;
        for(int i=3; i<=n; i++) {
            fn = f1 + f2;
            f1 = f2; 
            f2 = fn;
        }
        return fn;
    }
}