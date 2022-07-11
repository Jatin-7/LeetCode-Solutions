class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if(m==r && n==c) return mat;
        if(r*c != m*n) return mat;
        
        int sol[][] = new int[r][c];
        
        int tempArr[] = new int[m*n];
        int tC = 0;
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                tempArr[tC] = mat[i][j];
                tC++;
            }
        }
        
        tC = 0;
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                sol[i][j] = tempArr[tC];
                tC++;
            }
        }
        return sol;
    }
}