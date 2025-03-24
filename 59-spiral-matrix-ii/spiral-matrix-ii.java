class Solution {
    public int[][] generateMatrix(int n) {
        int endr=n-1,endc=n-1;
        int sr=0,sc=0,k=1;
        int [][]arr= new int[n][n];
        while(sr<=endr && sc<=endc){
            for(int i= sc;i<=endc;i++){
                arr[sr][i]=k++;
            }
            for(int i=sr+1;i<=endr;i++){
                arr[i][endc]=k++;
            }
            for(int i=endc-1;i>=sc;i--){
                if(sr!=endr)
                arr[endr][i]=k++;
            }
            for(int i=endr-1;i>sr;i--){
                if(sc!=endc)
                arr[i][sc]=k++;
            }
            sc++;sr++;endc--;endr--;
        }
        return arr;

    }
}