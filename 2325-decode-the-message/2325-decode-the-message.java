class Solution {
    public String decodeMessage(String key, String message) {
       
        char ch = 'a';
        Map<Character, Character> map = new HashMap<Character, Character>();
        for(int i = 0; i < key.length(); i++){
            char tmp = key.charAt(i);
            if(tmp != ' ' && !map.containsKey(tmp)){
                map.put(tmp, ch);
                ch = (char)(ch+1);
            }
        }
        
        // System.out.print(map);
        
        String res = "";
        for(int i = 0; i<message.length(); i++) {
            char tmp = message.charAt(i);
            
            if(tmp != ' '){
                tmp = map.get(tmp);
            }
            
            res = res + tmp;
        }
        return res;
    }
}