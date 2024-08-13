import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> result = new ArrayList<>();
        for(int i = 0; i < strArr.length; i++){
            if(!(strArr[i].contains("ad")))
                result.add(strArr[i]);
        }
        String[] answer = new String[result.size()];
        for(int j = 0; j < result.size(); j++){
            answer[j] = result.get(j);
        }
        return answer;
    }
}