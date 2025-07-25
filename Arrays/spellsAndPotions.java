import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class spellsAndPotions {

    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        List<Integer> ls = new ArrayList<>();
        int[] result = new int[spells.length];  // Change long[] to int[]

        for (int i = 0; i < spells.length; i++) {
            int spell = spells[i];
            int low = 0, high = potions.length - 1;
            long target = (success + spell - 1) / spell;
            int index = potions.length;  // Default to potions.length

            while (low <= high) {
                int mid = low + (high - low) / 2;
                if ((long) potions[mid] < target) {
                    low = mid + 1;
                } else {
                    index = mid;
                    high = mid - 1;
                }
            }

            int count = potions.length - index;  // Change long to int
            ls.add(count);  // No error now
        }

        for (int i = 0; i < ls.size(); i++) {
            result[i] = ls.get(i);
        }

        return result;  // No type mismatch
    }

    public int[] successfulPairsBrute(int[] spells, int[] potions, long success) {
        List<Integer> ls = new ArrayList<>();
        int[] result = new int[spells.length];
        for(int i=0; i<spells.length; i++){
            int cnt = 0;
            for(int j=0; j<potions.length; j++){
                if((long)spells[i]*potions[j]>=success){
                    cnt++;
                }
            }
            ls.add(cnt);
        }
        for(int i=0; i<ls.size(); i++){
            result[i] = ls.get(i);
        }
        return result;
    }
}