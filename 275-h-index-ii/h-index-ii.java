class Solution {
    public int hIndex(int[] c) {
        
        int l=0;int r=c.length-1;
        int N = c.length;
        while(l<=r){
            int mid=(l+r)/2;
            if(c[mid] == N-mid){
                return  N-mid;
            }
            else if(c[mid] > N-mid){
                r=mid- 1;
            }
            else{
                l=mid+1;
            }
        }
        return N-l;
    }
}