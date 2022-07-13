class Solution {
    
    public static boolean binSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return true;
            }
            if(target>arr[mid]){
                start++;
            }
            else{
                end--;
            }
        }
        return false;
    }
    
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean res = false;
        for(int i = 0; i < matrix.length; i++) {
            if(binSearch(matrix[i], target)){
                res = true;
            }
        }
        return res;
    }
}