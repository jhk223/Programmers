class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length - 5];
        int temp = 0;
        for(int i = 0; i < num_list.length; i++){
            for(int j = i+1; j < num_list.length; j++){
                if(num_list[i] > num_list[j]){
                    temp = num_list[i];
                    num_list[i] = num_list[j];
                    num_list[j] = temp;
                }
            }
        }
        for(int k = 0; k < answer.length; k++){
            answer[k] = num_list[k+5];
        }
        return answer;
    }
}