class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int n = s.lastIndexOf(" ") + 1;
        s = s.substring(n);
        return s.length();
    }
}