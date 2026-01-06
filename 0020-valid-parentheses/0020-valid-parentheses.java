class Solution {
    public boolean isValid(String s) {
        Stack<Character> ss = new Stack<>();   // ✅ moved outside loop

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){
                ss.push(ch);
            } else {
                if(ss.isEmpty()){
                    return false;
                }
                if( (ss.peek() == '(' && ch == ')') ||
                    (ss.peek() == '[' && ch == ']') ||
                    (ss.peek() == '{' && ch == '}') ){
                    ss.pop();
                } else {
                    return false;   // ❗ important case
                }
            }
        }
        return ss.isEmpty();  // ✅ stack must be empty at end
    }
}
