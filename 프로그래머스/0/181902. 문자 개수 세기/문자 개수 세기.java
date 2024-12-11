import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        char[] charArr = my_string.toCharArray();
        int unicode = 0;
        Arrays.sort(charArr);
        String result = new String(charArr); 
        for(int i = 0; i < result.length(); i++){
            boolean isUpperCase = String.valueOf(result.charAt(i)).equals(String.valueOf(result.charAt(i)).toUpperCase());
            if(isUpperCase){
             unicode = result.charAt(i);
            answer[unicode-65]++;   
            }
            else{
             unicode = result.charAt(i);
            answer[unicode-71]++;   
            }
        }
        return answer;
    }
}