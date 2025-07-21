class Solution {
    public String makeFancyString(String s) {
        int cnt=0;
        char prev='0';
        StringBuilder ans=new StringBuilder("");
        for(char c:s.toCharArray()){
            if(prev!=c){
                cnt=1;
                ans.append(c);
            }
            else{
                cnt++;
                if(cnt<3){
                    ans.append(c);
                }
            }
            prev=c;
        }
        return ans.toString();
    }
}