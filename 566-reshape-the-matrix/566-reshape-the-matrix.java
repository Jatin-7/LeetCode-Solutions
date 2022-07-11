class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if(m==r && n==c) return mat;
        if(r*c != m*n) return mat;
        
        int sol[][] = new int[r][c];
        
        for(int i = 0; i<r*c; i++){
            sol[i/c][i%c] = mat[i/n][i%n];
        }
        return sol;
    }
}