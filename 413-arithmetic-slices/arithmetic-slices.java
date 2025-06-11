class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<3) return 0;
        int c=0;
        int diff= Integer.MIN_VALUE;
        int diffc=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]-nums[i]==diff){
                diffc++;
                c+=diffc;
            }
            else{
                diffc=0;
            }
            diff=nums[i-1]-nums[i];
        }
        return c;
    }
}