class Solution {
    public boolean isPossibleToSplit(int[] nums) {

        HashMap<Integer, Integer> set1 = new HashMap<Integer, Integer>();

        for (int num : nums) {
            if (set1.containsKey(num)) {
                if (set1.get(num) == 2) {
                    return false;
                }
                set1.put(num, set1.get(num) + 1);
            } else {
                set1.put(num, 1);
            }
        }

        return true;
    }
}