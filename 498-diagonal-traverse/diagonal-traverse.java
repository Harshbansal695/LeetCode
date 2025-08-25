class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[] ans = new int[n * m];
        
        int r = 0, c = 0;  
        int dir = 1;     
        
        for (int i = 0; i < n * m; i++) {
            ans[i] = mat[r][c];
            
            if (dir == 1) {
                if (c == m - 1) { 
                    r++;
                    dir = -1;
                } else if (r == 0) { 
                    c++;
                    dir = -1;
                } else { 
                    r--;
                    c++;
                }
            } else { 
                if (r == n - 1) { 
                    c++;
                    dir = 1;
                } else if (c == 0) { 
                    r++;
                    dir = 1;
                } else {
                    r++;
                    c--;
                }
            }
        }
        
        return ans;
    }
}
