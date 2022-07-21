class Solution {
    
    public static double mult(double x, int n){
        
        double res;
        if(x==0) return 0.0;
        if(n==0) return 1.0;
        res = mult(x, n/2);
        res = res*res;
        if(n%2==0){
            return res;
        }
        return x*res;
    }
    
    public double myPow(double x, int n) {
        
        double res = mult(x, Math.abs(n));
        if(n<0){
            return 1/res;
        }
        return res;
    }
}