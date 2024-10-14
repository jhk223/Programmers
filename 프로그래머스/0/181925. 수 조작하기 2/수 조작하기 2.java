class Solution {
    public String solution(int[] numLog) {
        int leng = numLog.length;
        String answer = "";
        for(int i = 0; i < leng -1; i++){
            if(numLog[i+1] - numLog[i] == 1){
                answer += 'w';
            }
            else if(numLog[i+1] - numLog[i] == -1){
                answer += 's';
            }
            else if(numLog[i+1] - numLog[i] == 10){
                answer += 'd';
            }
            else
                answer += 'a';
        }
        
        return answer;
    }
}