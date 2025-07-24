import java.util.Collections;
import java.util.HashMap;

public class numberOfSubstrings3Characters {

    public int numberOfSubstringsSlidingWindow(String s) {
        int result = 0;
        int left = 0;
        int[] freq = new int[3]; // for 'a', 'b', 'c'

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;

            // Check if current window [left...i] contains all 3 characters
            while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
                result += s.length() - i;

                // shrink window from left
                freq[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return result;  
    }

    public int numberOfSubstringsBruteUsingMap(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int substring=0;
        map.put('a', -1);
        map.put('b', -1);
        map.put('c', -1);
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), i);
            if(Collections.min(map.values()) != -1){
                int min = Collections.min(map.values());
                substring = substring + (min+1);
            }
        }
        return substring;
    }
    
    public int numberOfSubstringsBrute(String s) {
        int count=0;
        for(int i=0; i<s.length(); i++){
            StringBuilder res = new StringBuilder();
            for(int j=i; j<s.length(); j++){
                res.append(s.charAt(j));
                if(res.toString().contains("a") && res.toString().contains("b") && res.toString().contains("c") ){
                    count++;
                }
            }
        }
        return count;
    }
}