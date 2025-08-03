class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int [][]dp = new int[n+1][n+1];
        String sr = new StringBuilder(s).reverse().toString();
        for(int []i:dp) Arrays.fill(i,-1);
        return lps(s,sr,n,n,dp);
    }
    private int lps(String s,String sr,int i ,int j,int[][]dp){
        if(i==0 || j==0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i-1)==sr.charAt(j-1)){
            dp[i][j]=1+lps(s,sr,i-1,j-1,dp);
            return dp[i][j];
        }
        else{
            dp[i][j]= Math.max(lps(s,sr,i-1,j,dp),lps(s,sr,i,j-1,dp));
            return dp[i][j];
        }
        
    }
}