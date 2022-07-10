class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> al = new ArrayList<>();
        if(nums1.length == 0 || nums2.length==0){
            return new int[0];
        }
        int i = 0, j = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                al.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        int arr[] = new int[al.size()];
        for(int k = 0; k<al.size(); k++){
            arr[k] = al.get(k);
        }
        return arr;
    }
}