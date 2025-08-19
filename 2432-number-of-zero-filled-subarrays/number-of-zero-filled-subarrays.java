class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int curr =0;
        long ts=0;
        for(int i=0;i<nums.length ;i++){
            if(nums[i]==0){
                curr++;
            }
            else{
                if(curr>0){
                    ts +=cs(curr);
                }
                curr=0;
            }
        }
        if(curr>0){
                    ts +=cs(curr);
        }
        return ts;
    }
    private long cs(int n){
        if(n==1) return 1;
        return n+cs(n-1);
    }
}