class Solution {
    public int longestSubarray(int[] nums) {
        int max =0;
        int i=0;int l=0,p=0,cnt=0;
        while(i<nums.length){
            if(nums[i]==0){
                cnt++;
                if(cnt==2){
                    max = Math.max(max,i-l-1);
                    l=p+1;
                    cnt =1;
                }
                p=i;
            }
            max= Math.max(max,i-l);
            i++;
        }
        return max;
    }
}