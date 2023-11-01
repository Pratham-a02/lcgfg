class Solution{
    public int evalRPN(String[] tokens){
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0;i<tokens.length;i++){
            String s = tokens[i];
            
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                int val2 = st.pop();
                int val1 = st.pop();
                
                if(s.equals("+")){
                    st.push(val1 + val2);
                }
                else if(s.equals("-")){
                    st.push(val1 - val2);
                }
                else if(s.equals("*")){
                    st.push(val1 * val2);
                }
                else if(s.equals("/")){
                    st.push(val1/val2);
                }
            }
            else{
                int val = Integer.parseInt(s);
                st.push(val);
            }
        }
        
        return st.pop();
    }
}