import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        char temp = ' ';
        String temp2 = "";
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        String result = new String(ch);
        for(int i = 0; i < s.length(); i++){
            temp = result.charAt(i);
            temp2 = result.substring(0,i) + result.substring(i+1);
            if(!(temp2.contains(String.valueOf(temp))))
                answer += temp;
           }
        return answer;
    }
}