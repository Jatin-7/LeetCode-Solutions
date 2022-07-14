class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        s = s.substring(s.lastIndexOf(" ") + 1);
        return s.length();
    }
}