class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int lenMy= myString.length();
        int lenPa= pat.length();
        for(int i = myString.length() -1; i >= 0 + lenPa -1; i--){
            if(myString.substring(i - lenPa +1, i+1).equals(pat)){
                answer = myString.substring(0, i+1);
                break;
            }
        }
            
        return answer;
    }
}