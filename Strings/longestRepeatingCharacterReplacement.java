import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class longestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer>  map = new HashMap<>();
        int l=0, r=0;
        int maxLength=0, maxFreq=0;
        int changes=0;
        for(r=0; r<s.length(); r++){
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r),0) + 1);
            maxFreq = Math.max(maxFreq, map.get(s.charAt(r)));
            changes = (r-l+1) - maxFreq;
            if(changes <= k)
                maxLength = Math.max(maxLength, (r-l+1));
            else{
                while(changes>k){
                    map.put(s.charAt(l), map.get(s.charAt(l))-1);
                    l++;
                    maxFreq = Collections.max(map.values());
                    changes = (r-l+1) - maxFreq;
                }
            }
        }
        return maxLength;
    }
}
