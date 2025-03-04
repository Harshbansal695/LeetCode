public class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char c : t.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        int begin = 0, end = 0;
        int counter = t.length();
        int len = Integer.MAX_VALUE;
        String ans = "";
        while (end < s.length()) {
            char endChar = s.charAt(end);
            if (hm.containsKey(endChar)) {
                if (hm.get(endChar) > 0) {
                    counter--;
                }
                hm.put(endChar, hm.get(endChar) - 1);
            }
            end++;
            while (counter == 0) {
                if (end - begin < len) {
                    len = end - begin;
                    ans = s.substring(begin, end);
                }
                char startChar = s.charAt(begin);
                if (hm.containsKey(startChar)) {
                    hm.put(startChar, hm.get(startChar) + 1);
                    if (hm.get(startChar) > 0) {
                        counter++;
                    }
                }
                begin++;
            }
        }
        return ans;
    }
}
