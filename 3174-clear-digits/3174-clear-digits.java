class Solution {
    public String clearDigits(String s) {
        StringBuilder stack = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                // Remove closest non-digit character to the left
                if (stack.length() > 0) {
                    stack.deleteCharAt(stack.length() - 1);
                }
            } else {
                // Add non-digit character
                stack.append(ch);
            }
        }

        return stack.toString();
    }
}