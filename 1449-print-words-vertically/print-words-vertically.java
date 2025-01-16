class Solution {
    public List<String> printVertically(String s) {
        String[] str = s.split(" ");
        int max = 0;
        for (int i = 0; i < str.length; i++) {
            max = Math.max(max, str[i].length());
        }
        List<String> ll = new ArrayList<>();
        for (int i = 0; i < max; i++) {
            StringBuilder ans = new StringBuilder("");
            int c = 0;
            for (int j = 0; j < str.length; j++) {
                if (str[j].length() > i) {
                    c = 0;
                    ans.append(str[j].charAt(i));
                } else {
                    ans.append(" ");
                    c++;
                }
            }
            
            ll.add(ans.toString().substring(0, ans.length() - c));
        }
        return ll;
    }
}