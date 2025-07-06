public class isSubsequence {

    // Approach 1: Brute Force O(N^2)
    public static boolean isSubsequenceBruteForce(String s, String t) {
        if (s.length() == 0) return true;
        if (s.equals(t)) return true;
        int pos = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            boolean found = false;
            for (int j = pos; j < t.length(); j++) {
                if (t.charAt(j) == ch) {
                    found = true;
                    pos = j + 1;
                    break;
                }
            }
            if (!found) return false;
        }
        return true;
    }

    // Approach 2: Optimized O(N)
    public static boolean isSubsequenceOptimized(String s, String t) {
        int a = 0;
        if (s.equals(t)) return true;
        if (s.length() == 0) return true;
        for (int i = 0; i < t.length(); i++) {
            if (a < s.length() && s.charAt(a) == t.charAt(i)) {
                a++;
            }
            if (a == s.length()) return true;
        }
        return a == s.length();
    }

    // Approach 3: Two Pointer O(N)
    public static boolean isSubsequenceTwoPointer(String s, String t) {
        int sIndex = 0, tIndex = 0;
        while (sIndex < s.length() && tIndex < t.length()) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
            }
            tIndex++;
        }
        return sIndex == s.length();
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println("Brute Force: " + isSubsequenceBruteForce(s, t));      // true
        System.out.println("Optimized: " + isSubsequenceOptimized(s, t));          // true
        System.out.println("Two Pointer: " + isSubsequenceTwoPointer(s, t));       // true
    }
}
