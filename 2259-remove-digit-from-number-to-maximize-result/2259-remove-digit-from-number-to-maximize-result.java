class Solution {
    public String removeDigit(String number, char digit) {
        
        String max = "0";
        for(int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            if(c == digit) {
                if(max.compareTo(number.substring(0, i) + number.substring(i+1)) < 0){
                    max = number.substring(0, i) + number.substring(i+1);
                }
            }
        }
        
        return max;
    }
}