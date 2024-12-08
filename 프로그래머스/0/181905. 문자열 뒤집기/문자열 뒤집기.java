class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String temp = "";
        String temp2 = "";
     //   for(int i = s; i <= e; i++){
            temp = my_string.substring(s,e+1);
            for(int j = temp.length()-1; j >= 0; j--){
                temp2 += temp.charAt(j);
            }
            answer = my_string.substring(0,s)+ temp2 +my_string.substring(e+1);
       // }
        return answer;
    }
}