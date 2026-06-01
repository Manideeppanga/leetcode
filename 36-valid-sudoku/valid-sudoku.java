class Solution {
    public boolean isSafe(char[][] board,char ch, int r,int c){
        for(int i = 0;i < 9;i++){
            if(board[i][c] == ch && i != r){
                return false;
            }
        }
        for(int i = 0;i < 9;i++){
            if(board[r][i] == ch && i != c){
                return false;
            }
        }
        int stRow = (r/3) * 3;
        int stCol = (c/3) * 3;
        for(int i = stRow;i <= stRow + 2;i++){
            for(int j = stCol;j <= stCol + 2;j++){
                if(board[i][j] == ch && (i != r && j != c)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0;i < board.length;i++){
            for(int j = 0;j < board[0].length;j++){
                char ch = board[i][j];
                if(ch == '.'){
                    continue;
                }
                else{
                    if(!isSafe(board,ch,i,j)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}