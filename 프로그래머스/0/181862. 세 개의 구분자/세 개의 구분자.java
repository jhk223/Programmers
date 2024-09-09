class Solution {
    public String[] solution(String myStr) {
        String[] answer = myStr.replaceAll("[abc]+", " ").trim().split(" ");
        if(answer[0].isEmpty())
            return new String[] {"EMPTY"};
        return answer;
    }
}