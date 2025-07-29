import java.util.HashMap;
import java.util.Map;

public class equalRowColPairs {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean isEqual = true;
                for (int k = 0; k < n; k++) {
                    if (grid[i][k] != grid[k][j]) {
                        isEqual = false;
                        break;
                    }
                }
                if (isEqual) {
                    count++;
                }
            }
        }
        return count;
    }

    public int equalPairsMap(int[][] grid){
        int count=0, n=grid.length;
        Map<String, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<n; j++){
                sb.append(grid[i][j]).append(",");
            }
            String rowKey = sb.toString();
            map.put(rowKey, map.getOrDefault(rowKey, 0)+1);
        }
        for(int i=0; i<n; i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<n; j++){
                sb.append(grid[j][i]).append(",");
            }
            String colKey = sb.toString();
            count += map.getOrDefault(colKey, 0);
        }
        return count;
    }
}