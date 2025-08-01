class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        // if(n==0) {
        //     return true;
        // }
        // if(n>flowerbed.length) {
        //     return false;
        // }
        // if(flowerbed.length==1 && flowerbed[0]==0) {
        //     return true;
        // }

        // if(flowerbed.length==2) {
        //     if(flowerbed[0]==0 && flowerbed[1]==0) {
        //         n = n-1;
        //         if(n==0) {
        //             return true;
        //         }
        //     }      
        // }
        
        // if(flowerbed[flowerbed.length-1]==0 && flowerbed[flowerbed.length-2]==0){
        //     n = n-1;
        //     if(n==0) {
        //         return true;
        //     }
        // }

        // for(int i=2; i<flowerbed.length-1; i++) {
        //     if(flowerbed[i]==0) {
        //         if(flowerbed[i+1]==0 && flowerbed[i-1]==0){
        //             flowerbed[i]=1;
        //             n = n-1;
        //             if(n==0) {
        //                 return true;
        //             }
        //         }
        //     }
        // }
        // return false;
        
        if(n==0) {
            return true;
        }
        for(int i=0; i<flowerbed.length; i++) {
            if(flowerbed[i]==0) {
                boolean emptyLeft = ( i == 0) || (flowerbed[i-1] == 0);
                boolean emptyRight = ( i == flowerbed.length-1 ) || (flowerbed[i+1] == 0);
                if(emptyLeft && emptyRight) {
                    flowerbed[i]=1;
                    n--;
                    if(n==0) {
                        return true;
                    }
                }
            }
        }
        return false;


    }
}