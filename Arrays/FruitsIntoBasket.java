import java.util.Map;
import java.util.HashMap;
public class FruitsIntoBasket {
    public int totalFruit(int[] fruits) {
        int left=0, n=fruits.length, maxLen=0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int right=0; right<n; right++){
            map.put(fruits[right],  map.getOrDefault(fruits[right], 0)+1);
            while(map.size()>2){
                //if(map.containsKey(fruits[left])){
                    map.put(fruits[left], map.get(fruits[left])-1);
                    if(map.get(fruits[left])==0){
                        map.remove(fruits[left]);
                    }
                    left++;
                //}
            }
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }    
}
