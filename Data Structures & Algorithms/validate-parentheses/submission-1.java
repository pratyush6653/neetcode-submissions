class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {

            // push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } 
            else {
                // stack empty → invalid
                if (st.isEmpty()) return false;

                char top = st.pop();

                // check matching
                if (ch == ')' && top != '(') return false;
                if (ch == '}' && top != '{') return false;
                if (ch == ']' && top != '[') return false;
            }
        }

        return st.isEmpty(); // should be empty
    }
}
