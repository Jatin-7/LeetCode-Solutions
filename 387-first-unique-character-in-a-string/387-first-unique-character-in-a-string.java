class Solution {
    public int firstUniqChar(String s) {
        
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int n = s.length();
        
        for(int i = 0; i < n; i++) {
            char tmp = s.charAt(i);
            map.put(tmp, map.getOrDefault(tmp, 0)+1);
        }
        
        for(int i = 0; i < n; i++) {
            if(map.get(s.charAt(i)) == 1)
                return i;
        }
        System.gc();
        return -1;
    }
}