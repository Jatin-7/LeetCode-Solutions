class Solution {
    public boolean isPalindrome(int x) {
        boolean ans = true;
        int sum = 0, n = x;
        while(x>0){
            int lastDigit = x % 10;
            sum = sum*10 + lastDigit;
            x = x / 10;
        }
        if(sum == n){
            ans = true;
        }
        else{
            ans = false;
        }
        return ans;
    }
}