class Solution {
    public int minimumRecolors(String s, int k) {
        int []arr= new int[s.length()];
        int c=0;
        for(int i=0;i<s.length();i++)
            if(s.charAt(i)=='W') arr[i]=1;
        
        for(int i=0;i<k;i++)
            if(arr[i]==1) c++;
        
        int ans=c;
        for(int i=0;i<s.length()-k;i++){
            c+=arr[i+k];
            c-=arr[i];
            ans=Math.min(ans,c);
        }
        return ans;
    }
}