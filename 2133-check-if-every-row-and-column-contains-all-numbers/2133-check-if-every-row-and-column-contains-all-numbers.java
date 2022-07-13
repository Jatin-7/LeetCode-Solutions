class Solution {
    
    public boolean checkValid(int[][] matrix) {
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        int nums = rows+1;
        Set<String> set = new HashSet<>();
        
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                
                if(matrix[i][j]>=1 && matrix[i][j]<=nums) {
                    if(!set.add(matrix[i][j] + "@row" + i) ||
                       !set.add(matrix[i][j] + "@col" + j)) {
                        return false;
                    }
                }
                
            }
        }
        
        return true;
        
    }
}