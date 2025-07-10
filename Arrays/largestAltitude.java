public class largestAltitude {
    class Solution {
    public int largestAltitude(int[] gain) {
        if(gain.length==0) return 0;
        
        // int sum=0; int highAltitude=0;
        // for(int i=0; i<gain.length; i++) {
        //     sum=sum+gain[i];
        //     highAltitude = Math.max(sum, highAltitude);
        // }
        // return highAltitude;

        //prefixSum method 
        int[] prefixSum = new int[gain.length+1];
        prefixSum[0] = 0;
        int max = 0;
        for(int i=0; i<gain.length; i++) {
            prefixSum[i+1] = prefixSum[i] + gain[i];
            max = Math.max(max, prefixSum[i+1]);
        }
        return max;
    }
}
}
