class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> value = new HashMap<Integer, Integer>();
        List<Integer> ll = new ArrayList<>();
        int k=nums.length/3;
        for (int n : nums) {
            if (value.containsKey(n)) {
 
                value.put(n, value.get(n) + 1);
            }
            else {
                value.put(n, 1);
            }
        }
        Set<Integer> key=value.keySet();
        for(int n:key){
            if(value.get(n)>k){
                ll.add(n);
            }
        }
        return ll;
    }
}