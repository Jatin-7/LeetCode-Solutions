class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       
        int count[] = new int[26];
        Arrays.fill(count, 0);
        for(int i = 0; i<magazine.length(); i++){
            count[magazine.charAt(i)-'a']++;
        }
        for(int i = 0; i<ransomNote.length(); i++){
            int offset = ransomNote.charAt(i) - 'a';
            if(count[offset]>0)
                count[offset]--;
            else
                return false;
        }
        return true;
    }
}