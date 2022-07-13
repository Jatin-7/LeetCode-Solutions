class Solution {
     
    public boolean isValidSudoku(char[][] board) {
    
        Set<String> seen = new HashSet<>();
        
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(board[i][j] != '.') {
                    final char tmp = board[i][j];
                    if(!seen.add(tmp + "@row" + i) ||
                       !seen.add(tmp + "@col" + j) ||
                       !seen.add(tmp + "@box" + i/3 + j/3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}