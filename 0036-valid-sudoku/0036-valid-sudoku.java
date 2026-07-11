class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] box  = new boolean[9][9];

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j] != '.'){
                    int num = board[i][j]-'1';
                    int boxIdx = (i/3)*3+(j/3);
                    if(rows[i][num] || cols[j][num] || box[boxIdx][num]){
                        return false;
                    }
                    rows[i][num] = cols[j][num] = box[boxIdx][num] = true;
                }
            }
            
        }
        return true;


    }
}