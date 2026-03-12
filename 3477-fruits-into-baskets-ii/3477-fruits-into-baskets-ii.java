class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int toFruits = fruits.length;
        int unpFruits = toFruits;

        for(int i = 0; i < toFruits; i++){
            for(int j = 0; j < toFruits; j++){
                if(fruits[i] <= baskets[j]){
                    baskets[j] = 0;
                    unpFruits--; 
                    break;
                }
            }
        }

        return unpFruits;
    }
}