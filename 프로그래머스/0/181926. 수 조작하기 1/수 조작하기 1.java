class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        for(int i = 0; i < control.length(); i++){
        char button = control.charAt(i);
            switch(button){
                case 'w' :
                    n += 1;
                    break;
                case 's' :
                    n -= 1;
                    break;
                case 'd' :
                    n += 10;
                    break;
                case 'a' :
                    n -= 10;
                    break;
            }
        }
        return answer = n;
    }
}