import java.util.ArrayList;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        while(n != 1){
            if(n % 2 == 0){
                result.add(n);
                n = n / 2;
            }
            else if(n % 2 == 1){
                result.add(n);
                n = 3 * n + 1;
            }   
        }
        result.add(n);
        int[] answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);
        }
        return answer;
    }
}