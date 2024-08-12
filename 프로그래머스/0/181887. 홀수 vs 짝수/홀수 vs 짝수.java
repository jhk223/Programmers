class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int result1 = 0;
        int result2 = 0;
            for(int i = 0; i < num_list.length; i=i+2){
                result1 += num_list[i];
            }
            for(int i = 1; i < num_list.length; i=i+2){
                result2 += num_list[i];
            }
        if(result1 > result2)
            answer = result1;
            else 
                answer = result2;
        return answer;
    }
}