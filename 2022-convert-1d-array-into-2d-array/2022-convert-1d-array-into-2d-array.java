class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        
        int arr[][] = new int[m][n];
        if(original.length != m*n) return new int[0][];
        int c = 0;
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                arr[i][j] = original[c];
                c++;
            }
        }
        System.gc();
        return arr;
    }
}