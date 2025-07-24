public class lengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] arr = s.trim().split("\\s+");
        String result = arr[arr.length-1];
        return result.length();
    }
}
