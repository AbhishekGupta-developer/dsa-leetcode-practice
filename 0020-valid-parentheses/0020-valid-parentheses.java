class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 40 || s.charAt(i) == 91 || s.charAt(i) == 123) {
                stack.push(s.charAt(i));
            } else {
                if(
                    (stack.size() > 0 && s.charAt(i) == 41 && stack.peek() == 40) ||
                    (stack.size() > 0 && s.charAt(i) == 93 && stack.peek() == 91) ||
                    (stack.size() > 0 && s.charAt(i) == 125 && stack.peek() == 123)
                ) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        if(stack.size() > 0) {
            return false;
        } else {
            return true;
        }
    }
}