import java.util.HashMap;
import java.util.Map;

public class subarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum=0, subarrays=0;
        map.put(0,1);
        for(int i=0; i<nums.length; i++){
           sum += nums[i];
           int rem = sum - k;
           subarrays += map.getOrDefault(rem,0);
           map.put(sum, map.getOrDefault(sum, 0) +1);
        }
        return subarrays;
    }
}
