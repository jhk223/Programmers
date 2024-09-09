import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        my_string = my_string.replaceAll("[^0-9]", "");
        int[] answer = new int[my_string.length()];
        for (int j = 0; j < my_string.length(); j++) {
            answer[j] = my_string.charAt(j) - '0';
        }
        Arrays.sort(answer);
        return answer;
    }
}
