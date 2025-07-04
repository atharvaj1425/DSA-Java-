class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0, j = s.length() - 1;
        while (i < j) {
            boolean isIVowel = sb.charAt(i) == 'a' || sb.charAt(i) == 'e' || sb.charAt(i) == 'i' || sb.charAt(i) == 'o' || sb.charAt(i) == 'u' ||
                               sb.charAt(i) == 'A' || sb.charAt(i) == 'E' || sb.charAt(i) == 'I' || sb.charAt(i) == 'O' || sb.charAt(i) == 'U';

            boolean isJVowel = sb.charAt(j) == 'a' || sb.charAt(j) == 'e' || sb.charAt(j) == 'i' || sb.charAt(j) == 'o' || sb.charAt(j) == 'u' ||
                               sb.charAt(j) == 'A' || sb.charAt(j) == 'E' || sb.charAt(j) == 'I' || sb.charAt(j) == 'O' || sb.charAt(j) == 'U';

            if (isIVowel && isJVowel) {
                // Both are vowels, swap them
                char temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp);
                i++;
                j--;
            } else {
                // If i is not a vowel, move i forward
                if (!isIVowel) i++;
                // If j is not a vowel, move j backward
                if (!isJVowel) j--;
            }
        }
        return sb.toString();
    }
}