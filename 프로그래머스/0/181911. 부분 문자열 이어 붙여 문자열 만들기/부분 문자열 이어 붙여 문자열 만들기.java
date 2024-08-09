class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        int j = 0;
        String answer = "";
        for(int i = 0; i < my_strings.length; i++){
            answer += my_strings[i].substring(parts[i][j],parts[i][j+1]+1);
        }
        return answer;
    }
}