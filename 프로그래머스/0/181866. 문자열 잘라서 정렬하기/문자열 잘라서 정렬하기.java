import java.util.Arrays;
class Solution {
    public String[] solution(String myString) {
        myString = myString.replaceAll("x", " ");
        myString = myString.replaceAll("\\s+", " ").trim();
        String[] answer = myString.split(" ");
        Arrays.sort(answer);
        return answer;
    }
}