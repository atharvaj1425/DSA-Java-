import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class differenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        ArrayList<Integer> num1List = new ArrayList<>();
        ArrayList<Integer> num2List = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int num : nums1){
            set1.add(num);
        }
        for(int num : nums2){
            set2.add(num);
        }
        for(int num : set1){
            if(!set2.contains(num)) num1List.add(num);
        }
        for(int num : set2){
            if(!set1.contains(num)) num2List.add(num);
        }
        result.add(num1List);
        result.add(num2List);
        return result;
    }
    public List<List<Integer>> findDifferenceBrute(int[] nums1, int[] nums2){
        ArrayList<Integer> num1List = new ArrayList<>();
        ArrayList<Integer> num2List = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        // Check for elements in nums1 not in nums2
        for (int i = 0; i < nums1.length; i++) {
            int val = nums1[i];
            boolean found = false;
            for (int j = 0; j < nums2.length; j++) {
                if (val == nums2[j]) {
                    found = true;
                    break;
                }
            }
            if (!found && !num1List.contains(val)) {
                num1List.add(val);
            }
        }

        // Check for elements in nums2 not in nums1
        for (int i = 0; i < nums2.length; i++) {
            int val = nums2[i];
            boolean found = false;
            for (int j = 0; j < nums1.length; j++) {
                if (val == nums1[j]) {
                    found = true;
                    break;
                }
            }
            if (!found && !num2List.contains(val)) {
                num2List.add(val);
            }
        }

        result.add(num1List);
        result.add(num2List);

        return result;
    }
}
