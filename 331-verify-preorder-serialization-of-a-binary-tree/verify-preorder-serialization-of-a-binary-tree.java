class Solution {
    public boolean isValidSerialization(String preorder) {
        Stack<String> st = new Stack<>();
        String[] s= preorder.split(",");
        for(int i=0;i<s.length;i++){
            if(!s[i].equals("#")){
                st.push(s[i]);
            }
            else{
                st.push(s[i]);
                while(!st.isEmpty() && st.size()>2){
                    String a= st.pop();
                    String b = st.peek();
                    if(a.equals(b) && st.size()>1) {
                        st.pop();
                        if(st.pop().equals("#")) return false;
                        else st.push(s[i]);
                    }
                    else{
                        st.push(a);
                        break;
                    }
                }
            }
        }
        if(st.size()==1 && st.peek().equals("#")) return true;
        return false;
    }
}