class Solution {
    public int[] twoSum(int[] nums, int target) {
       int a=0;
       int []arr=new int[2];
        for(int i=0;i<nums.length-1;i++){
            int b=0;
            for(int j=i+1;j<nums.length;j++){
                a=nums[i]+nums[j];
                if(a==target){
                    arr[0]=i;
                    arr[1]=j;
                    b=1;
                    break;
                }
            }
            if(b==1) break;
        }
        return arr;
        
    }
}