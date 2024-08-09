import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            result.add(arr[i]);
        }
        for(int j = 0; j < delete_list.length; j++){
          result.remove(Integer.valueOf(delete_list[j]));
            }
        int[] answer = new int[result.size()];
        for(int k = 0; k < result.size(); k++){
            answer[k] = result.get(k);
        }
        return answer;
    }
}
