class Solution {
    public int maxProduct(int[] nums) {
        int N1 = Integer.MIN_VALUE;
        int N2 = Integer.MIN_VALUE;
        
        for(int num : nums){
            if(num > N1){
                N2 = N1;
                N1 = num;
            }
            else if(num > N2){
                N2 = num;
            }
        }
        return (N1-1)*(N2-1);
    }
}