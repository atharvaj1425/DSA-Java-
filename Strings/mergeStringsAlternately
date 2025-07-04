class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1=word1.length(), n2=word2.length(), i=0, j=0;
        StringBuilder result = new StringBuilder();
        while(i<n1 || j<n2) {
            if(i<n1) result.append(word1.charAt(i++));
            if(j<n2) result.append(word2.charAt(j++));
        }
        return result.toString();
    }
}