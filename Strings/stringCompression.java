import java.util.ArrayList;
import java.util.List;

public class stringCompression {
    class Solution {
        public int compress(char[] chars) {
            List<Character> result = new ArrayList<>();
            if(chars.length==1) {
                return 1;
            }
            int i=0;
            while(i<chars.length){
                char curr_char = chars[i];
                int count=0;
                while(i<chars.length && chars[i]==curr_char) {
                    i++;
                    count++;
                }
                if(count>1){
                    result.add(curr_char);
                    for(char c : String.valueOf(count).toCharArray()){
                        result.add(c);
                    }
                }
                else{
                    result.add(curr_char);
                }
                for(int k=0; k<result.size(); k++){
                    chars[k]=result.get(k);
                }
            }
            return result.size();
        }
    }

}
