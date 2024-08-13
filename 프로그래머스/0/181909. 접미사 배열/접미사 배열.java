import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        int n = my_string.length();
        String[] answer = new String[n];
        String result = ""; 
        
        for(int i = 0; i < n; i++){
            result = my_string.substring(i); 
            answer[i] = result;
        }
        
        Arrays.sort(answer); 
        
        return answer;
    }
}
