class Solution {
    public String largestGoodInteger(String num) {
        char prev = '-';
        int cnt = 1;
        String ans = "";
        for (char c : num.toCharArray()) {
            if (c != prev) {
                prev = c;
                cnt = 1;
            } else {
                cnt++;
            }
            if (cnt >= 3) {
                String cur = "" + c + c + c;
                if (ans.equals("") || cur.compareTo(ans) > 0) {
                    ans = cur;
                }
            }
        }
        return ans;
    }
}