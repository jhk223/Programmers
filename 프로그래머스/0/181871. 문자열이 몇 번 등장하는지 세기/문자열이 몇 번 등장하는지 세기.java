class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int len = pat.length();
        for(int i = 0; i < myString.length() - len +1; i++){
            if(myString.substring(i, len + i).equals(pat)){
                answer++;
            }
        }
        return answer;
    }
}