class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        // Build left sum array
        leftSum[0] = 0;
        for (int i = 1; i < n; i++) {
            leftSum[i] = leftSum[i - 1] + nums[i - 1];
        }

        // Build right sum array
        rightSum[n - 1] = 0;
        for (int i = n - 2; i >= 0; i--) {
            rightSum[i] = rightSum[i + 1] + nums[i + 1];
        }

        // Compare left and right sums to find pivot index
        for (int i = 0; i < n; i++) {
            if (leftSum[i] == rightSum[i]) {
                return i;
            }
        }

        return -1; // No pivot index found
    }
}
class Solution1 {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] prefixSum = new int[n + 1]; // 1 extra to make indexing easy

        // Build prefix sum array
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }

        // Try every index to check if it's a pivot
        for (int i = 0; i < n; i++) {
            int leftSum = prefixSum[i];  // sum of elements before i
            int rightSum = prefixSum[n] - prefixSum[i + 1]; // sum of elements after i
            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }
}
