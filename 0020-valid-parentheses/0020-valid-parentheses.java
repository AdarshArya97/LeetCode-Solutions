class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char[] arr = s.toCharArray();
        for(char ch: arr){
            if(ch=='('){
                st.push(')');
            }
            else if(ch=='{'){
                st.push('}');
            }
            else if(ch=='['){
                st.push(']');
            }
            else if(st.isEmpty()|| st.pop()!=ch){
                return false;
            }
        }
        return st.isEmpty();
    }
}