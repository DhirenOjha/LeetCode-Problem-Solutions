class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        if(s.length()==1)
            return false;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
                st.push(s.charAt(i));
            else
            {
                if(st.empty())
                    return false;
                if(s.charAt(i)==')')
                {
                    if(st.peek()!='(')
                        return false;
                    else
                        st.pop();
                }
                else if(s.charAt(i)=='}')
                {
                    if(st.peek()!='{')
                        return false;
                    else
                        st.pop();
                }
                else
                {
                    if(st.peek()!='[')
                        return false;
                    else
                        st.pop();
                }
            }
        }
        if(st.empty())
            return true;
        return false;
    }
}