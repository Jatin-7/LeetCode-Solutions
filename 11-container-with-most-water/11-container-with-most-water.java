class Solution {
    public int maxArea(int[] height) {
        
        int start = 0;
        int end = height.length - 1;
        int area = 0;
        int res = 0;
        while(start<end){
            if(height[start] <= height[end]){
                area = height[start] * (end-start);
                start++;
            }
            else{
                area = height[end] * (end-start);
                end--;
            }
            if(area > res){
                res = area;
            }
        }
        return res;
    }
}