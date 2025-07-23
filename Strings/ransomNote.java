import java.util.HashMap;
import java.util.Map;

public class ransomNote {

    public boolean canConstructMap(String ransomNote, String magazine) {
        if(magazine.length()<ransomNote.length()) return false;
        Map<Character, Integer> hm = new HashMap<>();
        for(char c : magazine.toCharArray())
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        for(char r : ransomNote.toCharArray()){
            if(hm.containsKey(r) && hm.get(r)>0){
                hm.put(r, hm.get(r)-1);
            }
            else return false;
        }
        return true;
    }

    public boolean canConstructHashArray(String ransomNote, String magazine) {
    int[] arr = new int[26];
        for(char c: magazine.toCharArray()){
            arr[c-'a']++;
        }
        for(char r : ransomNote.toCharArray()){
            if(arr[r-'a']>0){
                arr[r-'a']--;
            }
            else return false;
        }
        return true;
    }
}
