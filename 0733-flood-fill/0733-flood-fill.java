class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
          int oldColor = image[sr][sc];
        if (oldColor == color) return image;

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{sr, sc});
        image[sr][sc] = color;

        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};

        while (!q.isEmpty()) {
            int[] curr = q.poll();

            for (int[] d : dir) {
                int r = curr[0] + d[0];
                int c = curr[1] + d[1];

                if (r >= 0 && c >= 0 && r < image.length && c < image[0].length
                        && image[r][c] == oldColor) {

                    image[r][c] = color;
                    q.add(new int[]{r, c});
                }
            }
        }

        return image;
    }
}