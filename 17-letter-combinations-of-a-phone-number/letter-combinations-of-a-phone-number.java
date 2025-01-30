class Solution {
    static String []arr={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static List<String> letterCombinations(String digits) {
         List<String> ll = new ArrayList<>();
        
         if(digits.length()>0)
         la(ll,digits,"");
        return ll;
    }
    public static  void la(List<String> ll,String s,String ans){
        if(s.length()==0){
            ll.add(ans);
            return;
        }
        char ch= s.charAt(0);
        String p = arr[ch-'0'];
        for(int i=0;i<p.length();i++){
            la(ll,s.substring(1),ans+p.charAt(i));
        }
    }
}