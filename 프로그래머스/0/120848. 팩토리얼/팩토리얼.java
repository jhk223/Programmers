class Solution {
    public int solution(int n) {
        int i = 1;  
        int cnt = 1;  
        
        while (cnt <= n) {
            i++;  
            cnt *= i;  
        }
        
        return i - 1;
    }
}
