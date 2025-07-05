class Solution {
    public int findLucky(int[] arr) {
        int [] ar = new int[501];
        for(int i:arr){
            ar[i]++;
        }
        for(int i=500;i>=1;i--){
            if(i==ar[i]){
                return i;
            }
        }
        return -1;
    }
}