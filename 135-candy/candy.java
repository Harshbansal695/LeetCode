class Solution {
    public int candy(int[] rat) {
        int ans =0;
        int n = rat.length;
        int[] l = new int[n];
        int []r = new int[n];
        l[0]= 1;
        r[n-1]=1;
        int curr=1;
        for(int i=1;i<n;i++){
            if(rat[i]>rat[i-1]){
                l[i]=++curr;
            }
            else{
                l[i]=1;
                curr=1;
            }
        }
        curr=1;
        for(int i= n-2;i>=0;i--){
            if(rat[i]>rat[i+1]){
                r[i]=++curr;
            }
            else{
                r[i]=1;
                curr=1;
            }
        }
        for(int i=0;i<n;i++){
            ans+=Math.max(l[i],r[i]);
        }
        return ans;
    }
}