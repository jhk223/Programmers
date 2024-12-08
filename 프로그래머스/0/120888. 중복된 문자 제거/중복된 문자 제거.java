class Solution {
    public String solution(String my_string) {
        String answer = "";
        String cha = "";
        for(int i = 0; i < my_string.length(); i++){
            cha = String.valueOf(my_string.charAt(i));
                if(!answer.contains(cha)){
                    answer += cha;
                }
        }
        return answer;
    }
}