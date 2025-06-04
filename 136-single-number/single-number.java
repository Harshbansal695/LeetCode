class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> charCountMap= new HashMap<Integer, Integer>();
        int a=0;
           for (int c : nums) {
            if (charCountMap.containsKey(c)) {
 
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
            else {

                charCountMap.put(c, 1);
            }
            }
            for(int c:nums){
                if(charCountMap.get(c)==1){
                    a=c;
                }
            }
            return a;
        
    }
}