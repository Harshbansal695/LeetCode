class Solution {
    public int hIndex(int[] c) {
        int []count = new int [c.length+1];

        for(int i=0;i<c.length;i++){
            if(c[i]>c.length){
                count[c.length]++;
            }
            else{
                count[c[i]]++;
            }
        }

        int sum=0;
        for(int i= count.length-1;i>=0;i--){
            sum+=count[i];
            if(sum>=i){
                return i;
            }
        }
        return 0;
    }
}