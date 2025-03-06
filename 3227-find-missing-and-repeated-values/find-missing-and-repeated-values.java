class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int arr[]= new int[2];
        int k=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(hm.containsKey(grid[i][j])){
                    arr[0]=grid[i][j];
                }
                else{
                    hm.put(grid[i][j],1);
                }
            }
        }

        for(int i=0;i<grid.length*grid.length;i++){
            if(!hm.containsKey(i+1)){
                arr[1]=i+1;
                break;
            }
        }
        return arr;
    }
}