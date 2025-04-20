class Solution {
    public int numRabbits(int[] ans) {
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(int n:ans){
            hm.put(n,hm.getOrDefault(n, 0) + 1);
        }
        int totalRabbits = 0;
        
        for (int n : hm.keySet()) {
            int count = hm.get(n);
            int groupSize = n + 1;
            int numberOfGroups = (count + groupSize - 1) / groupSize; 
            totalRabbits += numberOfGroups * groupSize;
        }
        
        return totalRabbits;
    }
}