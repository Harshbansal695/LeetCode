class Solution {
    public String removeDuplicateLetters(String s) {
        Map<Character, Integer> count = new HashMap<>();
        for (char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        Stack<Character> stack = new Stack<>();
        Set<Character> seen = new HashSet<>();
        for (char c : s.toCharArray()) {
            count.put(c, count.get(c) - 1);            
            if (seen.contains(c)) {
                continue;
            }
            while (!stack.isEmpty() && stack.peek() > c && count.get(stack.peek()) > 0) {
                seen.remove(stack.pop());
            }
            stack.push(c);
            seen.add(c);
        }

        
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }

        return result.toString();

    }
}