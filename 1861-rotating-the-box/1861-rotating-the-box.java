class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {

        int rows = boxGrid.length;
        int cols = boxGrid[0].length;

        for (int r = 0; r < rows; r++) {
            int empty = cols - 1;
            for (int c = cols - 1; c >= 0; c--) {
                if (boxGrid[r][c] == '*') {
                    empty = c - 1;
                }
                else if (boxGrid[r][c] == '#') {
                    char temp = boxGrid[r][c];
                    boxGrid[r][c] = boxGrid[r][empty];
                    boxGrid[r][empty] = temp;

                    empty--;
                }
            }
        }

        char[][] ans = new char[cols][rows];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                ans[c][rows - 1 - r] = boxGrid[r][c];
            }
        }
        return ans;
    }
}