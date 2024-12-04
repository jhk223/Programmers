class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        String result = "";
        for(int i = 0; i < my_string.length(); i+=m){
         result = my_string.substring(i,i+m);
        answer += result.charAt(c-1);
        }
        return answer;
    }
}