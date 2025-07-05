class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i:arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int n=-1;
        for(int i:hm.keySet()){
            if(i==hm.get(i) && i>n){
                n=i;
            }
        }
        return n;
    }
}