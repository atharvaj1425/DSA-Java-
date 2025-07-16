import java.util.Stack;

public class asteroidCollision{
    public int[] asteroidCollisionUsingStack(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        
        for(int num : asteroids){
            if(num>0){
                st.push(num);
            }
            else{
                while(!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(num)){
                    st.pop();
                }
                if(!st.isEmpty() && st.peek() == Math.abs(num)){
                    st.pop();
                }
                else if(st.isEmpty() || st.peek() < 0){
                    st.push(num);
                }
            }

        }
        
        int[] result = new int[st.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = st.pop();
        }

        return result;
    }
}