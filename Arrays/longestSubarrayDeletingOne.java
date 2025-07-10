class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0, right = 0, zeroCount = 0, maxLen = 0;

        for (right = 0; right < nums.length; right++) {
            if (nums[right] == 0) zeroCount++;

            while (zeroCount > 1) {
                if (nums[left] == 0) zeroCount--;
                left++;
            }

            // Subarray size is (right - left + 1), but we must delete one element
            maxLen = Math.max(maxLen, right - left);
        }

        return maxLen;
    }
}