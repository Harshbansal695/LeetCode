class Solution {
    public int areaOfMaxDiagonal(int[][] dim) {
        double d =0;int ma =0;
        for(int i=0;i<dim.length;i++){
            int a = dim[i][0];
            int b = dim[i][1];
            int ar = a*b;
            double dig = Math.sqrt(a*a +b*b);
            if(dig>d){
                d=dig;
                ma =ar;
            }
            else if(dig==d){
                if(ar>ma){
                    ma=ar;
                }
            }
        }
        return ma;
    }
}