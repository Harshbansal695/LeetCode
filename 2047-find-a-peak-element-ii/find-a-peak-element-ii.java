class Solution {
    public int[] findPeakGrid(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (check(mat, i, j) == 1)
                    return new int[] { i, j };

            }
        }
        return new int[] { 0, 0 };
    }

    public int check(int[][] mat, int i, int j) {
        if (i != 0 && mat[i - 1][j] > mat[i][j])
            return 0;
        if (j != 0 && mat[i][j - 1] > mat[i][j])
            return 0;
        if (i != mat.length - 1 && mat[i + 1][j] > mat[i][j])
            return 0;
        if (j != mat[0].length - 1 && mat[i][j + 1] > mat[i][j])
            return 0;
        return 1;
    }
}
