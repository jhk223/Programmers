class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] sum = new int[included.length];
        for(int i = 0; i<included.length; i++){
            sum[i] = a+d*i;
        }
        for(int j = 0; j < sum.length; j++){
            if(included[j] == true)
                answer += sum[j];
        }
        return answer;
    }
}