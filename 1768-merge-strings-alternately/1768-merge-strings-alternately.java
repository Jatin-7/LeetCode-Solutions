class Solution {
    public String mergeAlternately(String word1, String word2) {
        int w1 = word1.length();
        int w2 = word2.length();
        int i = 0, j = 0;
        String res = "";
        while(i<w1 && j<w2){
            res += word1.charAt(i);
            res += word2.charAt(j);
            i++;
            j++;
        }
        if(w2>w1){
            while(j<w2){
                res += word2.charAt(j);
                j++;
            }
        }
        else{
            while(i<w1){
                res += word1.charAt(i);
                i++;
            }
        }
        return res;
    }
}