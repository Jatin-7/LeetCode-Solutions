class Solution {
    public int myAtoi(String s) {
        double min = -Math.pow(2, 31);
        double max = Math.pow(2, 31)-1;
        s = s.trim();
        if(s.length()==0 || s==null) {
            return 0;
        }
        int ind = 0;
        double ans = 0;
        boolean isNeg = false;
        
        if(s.charAt(0) == '+' || s.charAt(0) == '-'){
            ++ind;
        }
        if(s.charAt(0) == '-') {
            isNeg = true;
        }
        
        for(int i = ind; i<s.length(); i++){
            if(s.charAt(i)<'0' || s.charAt(i)>'9'){
                break;
            }
            
            ans = ans*10 + (int)(s.charAt(i)-'0');
        }
        
        if(isNeg){
            ans = -ans;
        }
        
        if(ans < min) {
            ans = min;
        }
         else if(ans > max){
            ans = max;
        }
        
        return (int)ans;
    }
}