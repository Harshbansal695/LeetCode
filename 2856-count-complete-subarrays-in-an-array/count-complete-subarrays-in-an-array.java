class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        for(int i:nums){
            hs.add(i);
        }
        Map<Integer, Integer> mpp = new HashMap<>();
        int left = 0, res = 0;
        int k = hs.size();
        for (int i = 0; i < nums.length; ++i) {
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);
            while (mpp.size() == k) {
                res += nums.length - i;
                mpp.put(nums[left], mpp.get(nums[left]) - 1);
                if (mpp.get(nums[left]) == 0) mpp.remove(nums[left]);
                left++;
            }
        }
        return res;
    
    }
}