import java.util.ArrayList;

class Solution {
    public String[] solution(String[] names) {
        ArrayList<String> arrayList = new ArrayList<>();
        
        for (int i = 0; i < names.length; i++) {
            if (i % 5 == 0) {
                arrayList.add(names[i]);
            }
        }
        String[] answer = new String[arrayList.size()];
        for (int j = 0; j < arrayList.size(); j++) {
            answer[j] = arrayList.get(j);
        }
        return answer;
    }
}
