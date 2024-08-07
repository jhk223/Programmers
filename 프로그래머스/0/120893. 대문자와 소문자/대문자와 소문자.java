class Solution {
    public String solution(String my_string) {
        String answer = "";
        String result;

        for (int i = 0; i < my_string.length(); i++) {
            result = String.valueOf(my_string.charAt(i));          
            if (result.equals(result.toUpperCase())) {
                result = result.toLowerCase(); 
            } else {
                result = result.toUpperCase(); 
            }
            answer += result;
        }
        return answer;
    }
}
