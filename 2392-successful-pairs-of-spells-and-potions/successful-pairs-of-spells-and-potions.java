class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int []arr= new int[spells.length];
        for (int i = 0; i < spells.length; i++) {
            int count = binarySearch(potions, spells[i], success);
            arr[i] = count;
        }
        
        return arr;
    }
     private int binarySearch(int[] potions, int spell, long success) {
        int left = 0, right = potions.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((long)potions[mid] * spell >= success) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return potions.length - left;
    }
}