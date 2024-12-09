class Solution {
    public int[] solution(int[] emergency) {
        int cnt = emergency.length+1;
        int[] answer = new int[emergency.length];
        for(int k = 0; k < emergency.length; k++){
            answer[k] = emergency.length;
        }
        for(int i = 0; i < emergency.length; i++){
           // cnt--;
            for(int j = i+1; j <emergency.length; j++){
                if(emergency[i] < emergency[j]){
                    answer[j] = answer[j] -1;
                }
                else {
                    answer[i] = answer[i]-1;
                   // answer[j] = answer[j]-1;  
                    
                }
            }
        }
        return answer;
    }
}