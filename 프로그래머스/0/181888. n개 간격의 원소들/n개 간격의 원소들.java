class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer;
        int j =0;
        if(num_list.length % n == 0)
            answer = new int[num_list.length/n];
        else
            answer = new int[num_list.length/n + 1];
        
        for(int i = 0; i < num_list.length; i++){
            if(i % n == 0)
            answer[j++] = num_list[i];
        }
        return answer;
    }
}