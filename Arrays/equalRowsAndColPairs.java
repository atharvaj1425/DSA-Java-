import java.util.HashMap;
import java.util.Map;

public class equalRowsAndColPairs {
    public int equalPairs(int[][] grid) {
        int count = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid.length; j++){
                boolean match = true;
                for(int k=0; k<grid.length; k++){
                    if(grid[i][k]!=grid[k][j]){
                        match = false;
                        break;
                    }
                }
                if(match){
                    count++;
                }
            }
        }
        return count;
    }

    public int equalPairsMap(int[][] grid) {
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