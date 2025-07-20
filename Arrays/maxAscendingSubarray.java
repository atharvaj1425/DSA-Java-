public class maxAscendingSubarray {
    public int maxAscendingSum(int[] nums) {
        if(nums.length == 1) return nums[0];
        int sum = nums[0];
        int max = Integer.MIN_VALUE;
        for(int i=1; i<nums.length; i++){
            if(nums[i]>nums[i-1]){
                sum += nums[i];
                max = Math.max(sum, max);
            }
            else {
                max = Math.max(max, sum);
                sum=nums[i];
                
            }
        }
        return max;
    }
}
