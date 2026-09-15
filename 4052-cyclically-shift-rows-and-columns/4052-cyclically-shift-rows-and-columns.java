class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {

        // row shift
        for(int i=0; i<n; i++){
            int k = rowShift[i];
            for(int x = 0; x < k; x++){
                int first = grid[i][0];
                for(int j=0; j<n-1; j++){
                    grid[i][j] = grid[i][j+1];
                }
                grid[i][n-1] = first;
            }
        }

        // col shift
        for(int j=0; j<n; j++){
            int k = colShift[j];
            for(int x=0; x<k; x++){
                int first = grid[0][j];
                for(int i=0; i<n-1; i++){
                    grid[i][j] = grid[i+1][j];
                }
                grid[n-1][j] = first;
            }
        }
        return grid;
    }
}