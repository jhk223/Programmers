class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        int[] result = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            result[i] = numbers[i]*2;
        }
        answer = result;
        return answer;
    }
}