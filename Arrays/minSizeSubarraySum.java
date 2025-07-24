public class minSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0, r=0, minLen=Integer.MAX_VALUE, sum=0;
        for(r=0; r<nums.length; r++){
            sum=sum+nums[r];
            if(sum<target) 
                continue;
            else 
                while(sum>=target){
                    minLen = Math.min(minLen, r-l+1);
                    sum=sum-nums[l];
                    l++;
                }
        }
        if(minLen==Integer.MAX_VALUE) return 0;
        else
            return minLen;
    }
}
