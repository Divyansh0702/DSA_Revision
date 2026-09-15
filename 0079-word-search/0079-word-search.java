class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(search(board, word, i, j, 0, m, n)) return true;
            }
        }
        return false;
    }

    static int[] r = {1, 0, -1, 0};
    static int[] c = {0, -1, 0, 1};

    public boolean search(char[][] board, String word, int i, int j, int idx, int m, int n){
        if(idx == word.length()) return true;

        if(i < 0 || i >= m || j < 0 || j >= n || board[i][j] != word.charAt(idx)) return false;

        char ch = board[i][j];
        board[i][j] = '#';

        boolean found = false;

        for(int x = 0; x < 4; x++){
            found = search(board, word, i + r[x], j + c[x], idx + 1, m, n);

            if(found) break;
        }

        // boolean found = search(board, word, i + 1, j, idx + 1, m, n) || 
        //                 search(board, word, i, j - 1, idx + 1, m, n) ||
        //                 search(board, word, i, j + 1, idx + 1, m, n) ||
        //                 search(board, word, i - 1, j, idx + 1, m, n);
        
        board[i][j] = ch;

        return found;
    }
}