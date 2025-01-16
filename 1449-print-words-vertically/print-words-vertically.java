class Solution {
    public List<String> printVertically(String s) {
      String []str = s.split(" ");
      int max=0;
      for(int i=0;i<str.length;i++){
        max= Math.max(max,str[i].length());
      }  
      List<String> ll = new ArrayList<>();
      for(int i=0;i<max;i++){
        String ans="";
        int c=0;
        for(int j=0;j<str.length;j++){
            if(str[j].length()>i){
                c=0;
                ans+=str[j].charAt(i);
            }
            else{
                ans+=" ";
                c++;
            }
        }    
        ans=ans.substring(0,ans.length()-c);                                                                               
        ll.add(ans);
      }
      return ll;
    }
}