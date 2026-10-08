class Solution {
    List<List<String>> ans = new ArrayList<>();
    public boolean isValid(char[][] board,int r,int c){
        for(int i = r;i >= 0;i--){
            if(board[i][c] == 'Q'){
                return false;
            }
        }
        int i = r,j = c;
        while(i >= 0 && j >= 0){
            if(board[i][j] == 'Q'){
                return false;
            }
            i--;
            j--;
        }
        i = r;j = c;
        while(i >= 0 &&j < board.length){
            if(board[i][j] == 'Q'){
                return false;
            }
            i--;j++;
        }
        return true;
    }
    public void nqueens(char[][] board,int r){
        if(r == board.length){
            copy(board,ans);
            return;
        }
        for(int i = 0;i < board.length;i++){
            if(isValid(board,r,i)){
                board[r][i] = 'Q';
                nqueens(board,r + 1);
                board[r][i] = '.';
            }

        }
    }
     
    public void copy(char[][] board, List<List<String>> ans){
        List<String> temp = new ArrayList<>();
        int n = board.length;
        for(int i = 0;i < n;i++){
           String t = "";
            for(int j = 0;j < n;j++){
               t += board[i][j];
            }
            temp.add(t);
        }
            ans.add(temp);
    }
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                board[i][j] = '.';
            }
        }
        nqueens(board,0);
        return ans;
    }
}