class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int n =mat.length;
        int m = mat[0].length;
        int ro[] = new int[m];
        int co[]= new int[n];
        System.out.println(ro.length);
        Arrays.fill(ro,n);
        Arrays.fill(co,m);
        HashMap<Integer,Integer> hm = new HashMap<>();
        HashMap<Integer,Integer> hm1 = new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                hm.put(mat[i][j],j);
                hm1.put(mat[i][j],i);
            }
        }
        for(int i=0;i<arr.length;i++){
            int a=hm.get(arr[i]);
            int b = hm1.get(arr[i]);
            ro[a]--;
            co[b]--;
            if(ro[a]==0|| co[b]==0){
                return i;

            }
        }
        return -1;


    }
}