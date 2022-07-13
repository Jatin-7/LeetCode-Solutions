class Solution {
    public boolean isAnagram(String s, String t) {
        
        Map<Character, Integer> map1 = new HashMap<Character, Integer>();
        Map<Character, Integer> map2 = new HashMap<Character, Integer>();
        for(int i = 0; i<s.length(); i++){
            char tmp1 = s.charAt(i);
            map1.put(tmp1, map1.getOrDefault(tmp1, 0)+1);
        }
        for(int i = 0; i<t.length(); i++){
            char tmp2 = t.charAt(i);
            map2.put(tmp2, map2.getOrDefault(tmp2, 0)+1);
        }
        System.gc();
        return map1.equals(map2);
    }
}