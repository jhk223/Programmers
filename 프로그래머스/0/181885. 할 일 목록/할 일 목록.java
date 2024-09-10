import java.util.ArrayList;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0; i < todo_list.length; i++){
            if(finished[i] == false)
                arr.add(todo_list[i]);
             }
        String[] answer = new String[arr.size()];
       for(int j = 0; j < answer.length; j++){
           answer[j] = arr.get(j);
       }
        return answer;
    }
}