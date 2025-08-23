class Solution {
    public int minimumArea(int[][] grid) {
         int rows = grid.length;
        int cols = grid[0].length;
        
        int minRow = rows, maxRow = -1;
        int minCol = cols, maxCol = -1;
        
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    if (i < minRow) minRow = i;
                    if (i > maxRow) maxRow = i;
                    if (j < minCol) minCol = j;
                    if (j > maxCol) maxCol = j;
                }
            }
        }
        
        
        int height = maxRow - minRow + 1;
        int width = maxCol - minCol + 1;
        
        return height * width;
    }
}