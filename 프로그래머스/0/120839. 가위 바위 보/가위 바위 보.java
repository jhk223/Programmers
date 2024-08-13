class Solution {
    public String solution(String rsp) {
        String answer = "";
        String result = "";
        for(int i = 0; i < rsp.length(); i++){
            result = String.valueOf(rsp.charAt(i));
            if(result.equals("2"))
                result = "0";
                else if(result.equals("0"))
                    result = "5";
            else
                result = "2";
            answer += result;
        }
        return answer;
    }
}