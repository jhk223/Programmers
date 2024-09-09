public class Solution {
    public int solution(String binomial) {
        String[] result = binomial.split(" "); 
        int num1 = Integer.parseInt(result[0]);
        String operator = result[1];
        int num2 = Integer.parseInt(result[2]);

        int answer = 0;
        if (operator.equals("+")) {
            answer = num1 + num2;
        } else if (operator.equals("-")) {
            answer = num1 - num2;
        } else if (operator.equals("*")) {
            answer = num1 * num2;
        }

        // 계산된 결과를 반환합니다.
        return answer;
    }
}
