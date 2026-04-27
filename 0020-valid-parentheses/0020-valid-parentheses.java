class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == 40 || ch == 91 || ch == 123) {
                stack.push(ch);
            } else {
                if(
                    (stack.size() > 0 && ch == 41 && stack.peek() == 40) ||
                    (stack.size() > 0 && ch == 93 && stack.peek() == 91) ||
                    (stack.size() > 0 && ch == 125 && stack.peek() == 123)
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