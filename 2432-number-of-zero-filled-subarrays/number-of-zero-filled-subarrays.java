class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long curr =0;
        long ts=0;
        for(int i=0;i<nums.length ;i++){
            if(nums[i]==0){
                curr++;
            }
            else{
                if(curr>0){
                    ts +=curr*(curr+1)/2;
                }
                curr=0;
            }
        }
        if(curr>0){
                    ts +=curr*(curr+1)/2;
        }
        return ts;
    }
    
}