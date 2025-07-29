import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class twoCloseStrings {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()) return false;
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(char c : word1.toCharArray()){
            freq1[c - 'a']++;
            set1.add(c);
        }
        for(char c : word2.toCharArray()){
            freq2[c - 'a']++;
            set2.add(c);
        }

        if(!set1.equals(set2)) return false;

        Arrays.sort(freq1);
        Arrays.sort(freq2);

        return Arrays.equals(freq1, freq2);
    }

    //using only hash array
    public boolean closeStrings2(String word1, String word2){
        int m=word1.length();
        int n=word2.length();
        if(m!=n) return false;

        int[] freq1= new int[26];
        int[] freq2= new int[26];

        for(int i=0;i<m;i++)
        {
            freq1[word1.charAt(i) -'a']++;
        }

        for(int i=0;i<n;i++)
        {
            freq2[word2.charAt(i) -'a']++;
        }

        for(int i=0;i<26;i++)
        {
            if(freq1[i]!=0 && freq2[i]!=0) continue;
            if(freq1[i]==0 && freq2[i]==0) continue;

            return false;
        }
        Arrays.sort(freq1);
        Arrays.sort(freq2);

        return Arrays.equals(freq1, freq2);    
    }

}
