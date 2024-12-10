class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String result = "";
        for(int i = 0; i < array.length; i++){
            result += String.valueOf(array[i]);
        }
        for(int j = 0; j < result.length(); j++){
            if("7".equals(String.valueOf(result.charAt(j))))
             answer++;
        }
        return answer;
    }
}