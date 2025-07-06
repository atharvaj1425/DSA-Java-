class Solution {
    public String reverseWords(String s) {
        s = s.trim() + " ";  // trim to avoid leading/trailing issues, add sentinel space
        Stack<String> st = new Stack<>();
        String str = "";
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                if (!str.isEmpty()) {  // avoid pushing empty words
                    st.push(str);
                    str = "";
                }
            } else {
                str += ch;
            }
        }
        
        StringBuilder ans = new StringBuilder();
        while (!st.isEmpty()) {
            ans.append(st.pop());
            if (!st.isEmpty()) ans.append(" ");  // add space only between words so last word doesnt add space
        }
        
        return ans.toString();
    }
}


class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for(int i = words.length -1;i>=0;i--){
            result.append(words[i]);
            if(i!=0) result.append(" ");
        }
        return result.toString();
    }
}
