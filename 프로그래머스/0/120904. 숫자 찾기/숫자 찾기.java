class Solution {
    public int solution(int num, int k) {
        String result = "";
        int answer = 0;
        result = String.valueOf(num);
        for(int i = 0; i < result.length(); i++){
            if(Integer.parseInt(String.valueOf(result.charAt(i))) == k ){
                             answer = i+1;
                           break;   
            }else
                answer = -1;
        }
        
        return answer;
    }
}