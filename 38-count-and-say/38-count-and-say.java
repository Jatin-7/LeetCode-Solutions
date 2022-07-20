class Solution {
    public String countAndSay(int n) {
     
        if(n == 1){
            return "1";
        }
        
        StringBuilder ans = new StringBuilder("1");
        
        for(int i = 2; i <= n; i++){
            StringBuilder tmp = new StringBuilder("");
            for(int j = 0; j < ans.length(); j++){
                int count = 1;
                while(j + 1 < ans.length() && ans.charAt(j) == ans.charAt(j + 1)){
                    count++;
                    j++;
                }
                tmp.append(String.valueOf(count));
                tmp.append(ans.charAt(j));
            }
            ans = new StringBuilder(tmp);
        }
        
        return ans.toString();
    }
}