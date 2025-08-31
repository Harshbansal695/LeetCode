class Solution {
    public void solveSudoku(char[][] board) {
       sudoku(board,0,0);
        }
        public static boolean safe(char[][] board, int row, int col, int x){
        char ch =(char)(x+'0');
        for(int j = 0; j<9; j++){        // for column check
            if(board[row][j] == ch){
                return false;
            }
        }
        for(int i = 0; i<9; i++){          // for row check.
            if(board[i][col] == ch){
                return false;
            }
        }
        int main_row = row - row%3;        // to calculate the present row's first index
        int main_col = col - col%3;         // to calculate the present col's first index
        for(int i = main_row; i< main_row+3; i++){
            for(int j = main_col; j< main_col+3; j++){
                if(board[i][j] == ch){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean sudoku(char[][] board,int row, int col){
        if(col == 9){
            return sudoku(board,row+1,0);
        }
        if(row == 9){
        return true;
        }
        if(board[row][col] != '.'){
        return sudoku(board,row,col+1);
        }
        for(int x = 1; x<=9;x++){
            if(safe(board,row,col,x)){
                board[row][col] = (char)(x+'0');
                if(sudoku(board,row,col+1))
                return true;
            }
               board[row][col] = '.';
        }
        return false;
    }
}