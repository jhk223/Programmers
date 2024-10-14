import java.util.*;
class Solution {
    public String solution(String my_string) {
        my_string = my_string.toLowerCase();
        char[] result = my_string.toCharArray();
        Arrays.sort(result);
        String answer = new String(result);
        return answer;
    }
}