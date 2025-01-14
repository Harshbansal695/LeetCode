class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
       int n = A.length;
       int [] arr = new int[n];
       int []c= new int[n];
       for(int i=0;i<n;i++){
        arr[A[i]-1]++;
        arr[B[i]-1]++;
        c[i]=find(arr);
       } 
       return c;
    }
    private int find(int[]arr){
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                c++;
            }
        }
        return c;
    }
}