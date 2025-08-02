class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int [][] dp = new int[n+1][m+1];
        for(int []i:dp){
            Arrays.fill(i,-1);
        }
        return lcs(text1,text2,n,m,dp);
    }
    public int lcs(String s1,String s2,int i , int j,int [][]dp){
        if(i==0 || j==0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i-1)==s2.charAt(j-1)){
            return dp[i][j]=1 + lcs(s1,s2,i-1,j-1,dp);
        }
        int a= lcs(s1,s2,i-1,j,dp);
        int b = lcs(s1,s2,i,j-1,dp);
        return dp[i][j]=Math.max(a,b);
    }
}