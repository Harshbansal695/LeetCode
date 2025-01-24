class Solution {
    public int numberOfSpecialChars(String word) {
        int [] l= new int[26];
        int [] u= new int[26];
        int i=0;
        Arrays.fill(l,-1);
        Arrays.fill(u,-1);
        for(char c:word.toCharArray()){
            if(Character.isUpperCase(c) && u[c-'A']==-1) u[c-'A']=i;
            else if(Character.isLowerCase(c)) l[c-'a']=i;
            i++;
        }
        int ans=0;
        for(i=0;i<26;i++){
            if(l[i]>=0 && u[i]>=0 && l[i]<u[i]) ans++;
        }
        return ans;
    }
}