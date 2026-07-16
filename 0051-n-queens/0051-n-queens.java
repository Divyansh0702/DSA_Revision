class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++){
            Arrays.fill(board[i], '.');
        }

        List<List<String>> res = new ArrayList<>();

        NQueens(board, 0, res);
        return res;
    }

    public void NQueens(char[][] board, int row, List<List<String>> res){
        int n = board.length;

        if(row == n){
            res.add(createBoard(board));
            return;
        }

        for(int col = 0; col < n; col++){
            if(isSafe(board, row, col)){
                board[row][col] = 'Q';
                NQueens(board, row + 1, res);
                board[row][col] = '.';
            }
        }
    }
    
    public boolean isSafe(char[][] board, int row, int col){
//  Upward
        int r = row - 1;
        while(r >= 0){
            if(board[r][col] == 'Q') return false;
            r--;
        }

// Left Diagonal
        r = row - 1; 
        int c = col - 1;
        while(r >= 0 && c >= 0){
            if(board[r][c] == 'Q') return false;
            r--;
            c--;
        }

// Right Diagonal
        r = row - 1; 
        c = col + 1;
        while(r >= 0 && c < board[0].length){
            if(board[r][c] == 'Q') return false;
            r--;
            c++;
        }

        return true;
    }

    public List<String> createBoard(char[][] board){
        List<String> temp = new ArrayList<>();

        for(char[] row : board){
            temp.add(new String(row));
        }

        return temp;
    }
}