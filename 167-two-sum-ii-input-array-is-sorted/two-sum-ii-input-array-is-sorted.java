class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int [] arr = {0,0};
        for(int i=0;i<numbers.length;i++){
            int a=target -numbers[i];
            int s=0,e=numbers.length-1;
            while(s<=e){
              int m=(s+e)/2;
            if(numbers[m]==a && i!=m && i<m){
                arr[0]=i+1;
                arr[1]=m+1;
            }
            if(numbers[m]>a){
                e=m-1;
            }
            else{
                s=m+1;
            }   
            }
                
        }
        return arr;
    }
}