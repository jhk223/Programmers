class Solution {
    public int solution(int n) {
        int answer = 0;
        String result = "";
        result = String.valueOf(n);
        for(int i = 0; i < result.length(); i++){
            answer += Integer.parseInt(String.valueOf(result.charAt(i)));
        }
        return answer;
    }
}