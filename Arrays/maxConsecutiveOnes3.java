public class maxConsecutiveOnes3 {
    class Solution {
    public int longestOnes(int[] nums, int k) {
        if(nums.length==0){ return 0; } 
        int left =0, right=0, zeros=0, maxLen=0;
        for(right=0; right<nums.length; right++){
            if(nums[right]==0) {
                zeros++;
            }
            while(zeros>k){
                if(nums[left]==0) {
                    zeros--;
                }
                left++; 
            }
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
}
}
