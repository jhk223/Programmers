public class Solution {
    public int[] solution(int[] arr) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            cnt += arr[i];
        }
        int[] answer = new int[cnt];
        int index = 0;
        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < arr[j]; k++) {
                answer[index++] = arr[j];
            }
        }

        return answer;
    }
}
