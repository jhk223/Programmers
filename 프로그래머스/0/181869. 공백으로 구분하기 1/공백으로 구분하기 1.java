class Solution {
    public String[] solution(String my_string) {
        String[] result = my_string.split(" ");
        String[] answer = new String[result.length];
        for(int i = 0; i < answer.length; i++){
            answer[i] = result[i];
        }

        return answer;
    }
}