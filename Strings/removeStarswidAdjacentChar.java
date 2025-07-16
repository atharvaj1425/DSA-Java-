import java.util.Stack;
public class removeStarswidAdjacentChar {
    public String removeStars(String s) {
        StringBuilder result = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch!='*'){
                result.append(ch);
            }
            else{
                // result.deleteCharAt(result.length()-1);
                result.delete(result.length()-1, result.length());
            }
        }
        return result.toString();
    }

    public String removeStarsUsingStack(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder result = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch!='*'){
                st.push(ch);
            }
            else{
                st.pop();
            }
        } 
        while(!st.isEmpty()){
            result.append(st.pop());
        }
        return result.reverse().toString();
    }
    
}
