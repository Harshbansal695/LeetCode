class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        Queue<int[]>q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    q.add(new int[]{i,j});
                }
                else{
                    mat[i][j]=Integer.MAX_VALUE;
                }
            }
        }
        int [][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
        while(!q.isEmpty()){
            int []p=q.poll();
            for(int []i:dir){
                int nr=i[0]+p[0];
                int nc=i[1]+p[1];
                if(nr>=0 && nc<m && nr<n && nc>=0 && mat[nr][nc]>1+mat[p[0]][p[1]]){
                    mat[nr][nc]=1+mat[p[0]][p[1]];
                    q.add(new int[]{nr,nc});
                }
            }
        }
        return mat;
}
}