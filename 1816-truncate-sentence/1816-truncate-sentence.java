class Solution {
    public String truncateSentence(String s, int k) {
        
        String arr[] = s.split(" ");
        String res = "";
        for(int i = 0; i < k; i++) {
            res = res + arr[i] + " ";
        }
        System.gc();
        return res.trim();
    }
}