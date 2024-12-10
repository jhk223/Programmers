import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] arrBefore = before.toCharArray();
        char[] arrAfter = after.toCharArray();
        Arrays.sort(arrBefore);
        Arrays.sort(arrAfter);
        String result = new String(arrBefore);
        String result2 = new String(arrAfter);
        
        if(result.equals(result2))
            answer = 1;
        else
            answer = 0;
        return answer;
    }
}