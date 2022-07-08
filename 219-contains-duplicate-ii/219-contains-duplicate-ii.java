class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        Set<Integer> set = new HashSet<Integer>();
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                j = i-1;
                while(j >= 0){
                    if(nums[j] == nums[i] && Math.abs(j-i) <= k){
                        return true;
                    }
                    j--;
                }
            }
            else{
                set.add(nums[i]);
            }
        }
        return false;
    }
}