import java.util.Stack;

class Solution {
    public void reverseString(char[] s) {
        Stack<Character> st = new Stack<>();

        // push all characters
        for (int i = 0; i < s.length; i++) {
            st.push(s[i]);
        }

        // pop back into array
        for (int i = 0; i < s.length; i++) {
            s[i] = st.pop();
        }
    }
}
