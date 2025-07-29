public class firstOccurence {
    public int strStr(String haystack, String needle) {
        StringBuilder s = new StringBuilder(haystack);
        int idx = s.indexOf(needle);
        if(idx!=-1) return idx;
        else return -1;
    }
    // two pointer approach
    public int strStrTwoPointer(String haystack, String needle) {
        if(needle.length() == 0) return 0;
        int n = haystack.length();
        int m = needle.length();
        for(int i = 0; i <= n - m; i++) {
            int j;
            for(j = 0; j < m; j++) {
                if(haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if(j == m) return i; // found the needle
        }
        return -1; // not found
    }
}
