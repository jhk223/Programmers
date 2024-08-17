import java.util.ArrayList;
class Solution {
    public int[] solution(String myString) {
        ArrayList<Integer> result = new ArrayList<>();
        int len = 0;
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) != 'x') {
                len++;
            }
            else{
                result.add(len);
                len = 0;
            }
        }
        result.add(len);

        int[] answer = new int[result.size()];
        for(int j = 0; j < result.size(); j++){
            answer[j] = result.get(j);
        }
        return answer;
    }
}
