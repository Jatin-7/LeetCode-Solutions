class Solution {
    
    public static boolean notInRow(char[][] board, int row) {
        
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < 9; i++){
            if(set.contains(board[row][i])){
                return false;
            }
            if(board[row][i] != '.'){
                set.add(board[row][i]);
            }
        }
        return true;
    }
    
    public static boolean notInCol(char[][] board, int col) {
        
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < 9; i++) {
            if(set.contains(board[i][col])) {
                return false;
            } 
            if(board[i][col] != '.') {
                set.add(board[i][col]);
            }
        }
        return true;
    }
    
    public static boolean notInGrid(char[][] board, int row, int col) {
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                char tmp = board[i+row][j+col];
                if(set.contains(tmp)){
                    return false;
                }
                if(tmp != '.') {
                    set.add(tmp);
                }
            }
        }
        return true;
    }
    
    public static boolean isValid(char[][] board, int row, int col) {
        return notInRow(board, row) && notInCol(board, col) && 
               notInGrid(board, row-row%3, col-col%3);
    }
    
    public static boolean isValidConfig(char[][] board, int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(!isValid(board, i, j)){
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean isValidSudoku(char[][] board) {
        
        boolean res = false;
        
        if(isValidConfig(board, 9)){
            res = true;
        }
        System.gc();
        return res;
    }
}