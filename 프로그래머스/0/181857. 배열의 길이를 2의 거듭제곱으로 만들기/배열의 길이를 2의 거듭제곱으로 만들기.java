class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length; 
        int cnt = 1;  

        while (cnt < len) {
            cnt = cnt * 2;
        }

        int[] answer = new int[cnt];

        for (int i = 0; i < len; i++) {
            answer[i] = arr[i];
        }

        return answer;
    }
}
