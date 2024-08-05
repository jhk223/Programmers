class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        if(n % 2 == 0){
            int[] result = new int[n/2];
            for(int i = 0; i < n/2; i++){
                result[i] = 2 * i + 1;
            }
            answer = result;
        }else{
            int[] result = new int[n/2 + 1];
            for(int i = 0; i < n/2 + 1; i++){
                result[i] = 2 * i + 1;
            }
            answer = result;
        }
        return answer;
    }
}