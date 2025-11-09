class Solution {
    public boolean isValid(String s) {
        int length = s.length();

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if(ch == ')') {
                    if(stack.size() == 0 || stack.peek() != '(') {
                        return false;
                    } else {
                        stack.pop();
                    }
                }
                if(ch == '}') {
                    if(stack.size() == 0 || stack.peek() != '{') {
                        return false;
                    } else {
                        stack.pop();
                    }
                }
                if(ch == ']') {
                    if(stack.size() == 0 || stack.peek() != '[') {
                        return false;
                    } else {
                        stack.pop();
                    }
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