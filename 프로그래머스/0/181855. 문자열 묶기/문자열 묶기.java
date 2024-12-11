class Solution {
    public int solution(String[] strArr) {
        int[] lengthCount = new int[31];
        
        for (int i = 0; i < strArr.length; i++) {
            int len = strArr[i].length();
            lengthCount[len]++;
        }
        
        int maxCount = 0;
        for (int i = 0; i < lengthCount.length; i++) {
            maxCount = Math.max(maxCount, lengthCount[i]);
        }
        
        return maxCount;
    }
}
