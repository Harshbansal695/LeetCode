class Solution {
    public int triangularSum(int[] nums) {
        
        int c=nums[0];
        for(int i=1;i<nums.length;i++){
            int [] arr = new int[nums.length-i];
            for(int j=0;j<arr.length;j++){
                int a= nums[j+1]+nums[j];
                if(a>9)
                arr[j]=a%10;
                else
                arr[j]=a;
            }
            if(arr.length==1){
                c=arr[0];
            }for(int j=0;j<arr.length;j++){
                nums[j]=arr[j];
            }


        }
        return c;
    }
}