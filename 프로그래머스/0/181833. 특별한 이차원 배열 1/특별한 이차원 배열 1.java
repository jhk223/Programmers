class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int i = 0;
            for(int j = 0; j < answer.length; j++){
            answer[i][j] = 1;
                i++;
                
        }
        return answer;
    }
}