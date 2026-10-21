class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA=0;
        int sumB=0;
        for(int i=0; i<aliceSizes.length;i++){
            sumA = sumA+aliceSizes[i];
        }
        for (int j = 0; j < bobSizes.length; j++) {
    sumB = sumB + bobSizes[j];
}
    int diff = sumB - sumA;
    for (int a: aliceSizes){
        for(int b: bobSizes){
            if(b-a ==diff/2){
                return new int[]{a,b};

            }
        }
    }

       return new int[0]; 
    }
}