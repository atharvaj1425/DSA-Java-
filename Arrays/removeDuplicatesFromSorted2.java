public class removeDuplicatesFromSorted2 {
    public int removeDuplicates(int[] nums) {
        int j=1, count=1;
        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[i-1]){
                count++;
            }
            else count=1;
            if(count<=2){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }

    public int removeDuplicatesSmall(int[] nums) {
        if(nums.length < 2) return nums.length;
        int left = 2;

        for(int right = 2;right<nums.length;right++){
            if(nums[right] != nums[left - 2]){
                nums[left] = nums[right];
                left++;
            }
            
        }
        return left;
    }
}
