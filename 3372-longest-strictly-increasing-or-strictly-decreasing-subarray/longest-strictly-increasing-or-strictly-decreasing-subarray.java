class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int a=1,b=1,max1=1,max2=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                a++;
                b=1;
                if(a>max1) max1=a;

            }
            else if(nums[i-1]<nums[i]){
                b++;
                a=1;
                if(b>max2) max2=b;
            }
            else {
                a=1;
                b=1;
            }
        }
        if(max1>max2) return max1;
        return max2;
    }
}