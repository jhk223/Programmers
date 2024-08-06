class Solution {
    public int solution(int price) {
        int answer = 0;
        int result = price;
        if(price >= 100000 && price < 300000)
            result = (int)(price * 0.95);
            else if(price >= 300000 && price < 500000)
                result = (int)(price * 0.9);
                else if(price >= 500000)
                    result = (int)(price * 0.8);
        answer = result;
        return answer;
    }
}