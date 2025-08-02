import java.util.HashMap;
import java.util.Map;
public class degreeOfArray {
    public static int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        Map<Integer, Integer> firstIndex = new HashMap<>();
        Map<Integer, Integer> lastIndex = new HashMap<>();

        int degree = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            freq.put(num, freq.getOrDefault(num, 0) + 1);
            degree = Math.max(degree, freq.get(num));

            if (!firstIndex.containsKey(num)) {
                firstIndex.put(num, i);
            }
            lastIndex.put(num, i);
        }

        int minLength = Integer.MAX_VALUE;
        for (int num : freq.keySet()) {
            if (freq.get(num) == degree) {
                int length = lastIndex.get(num) - firstIndex.get(num) + 1;
                minLength = Math.min(minLength, length);
            }
        }

        return minLength;
    }
}