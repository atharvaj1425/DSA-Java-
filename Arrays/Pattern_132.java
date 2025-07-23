import java.util.Stack;

public class Pattern_132 {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int second = Integer.MIN_VALUE;
        if(nums == null || nums.length<3) return false;
        for(int i=nums.length-1; i>=0; i--){
            if(nums[i]<second) return true;
            while(!st.isEmpty() && nums[i]>st.peek()){
                second=st.pop();
            }
            st.push(nums[i]);
        }
        return false;
    }
}
