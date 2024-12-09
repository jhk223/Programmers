class Solution {
    public int solution(int[] array, int n) {
        int min = array[0];  
        int minDiff = Math.abs(min - n);

        for (int i = 1; i < array.length; i++) {
            int currentDiff = Math.abs(array[i] - n); 

            if (currentDiff < minDiff || (currentDiff == minDiff && array[i] < min)) {
                min = array[i];
                minDiff = currentDiff;
            }
        }

        return min; 
    }
}
