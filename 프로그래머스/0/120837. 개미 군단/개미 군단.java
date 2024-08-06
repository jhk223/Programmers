class Solution {
    public int solution(int hp) {
        int answer = 0;
        int gAnt = 5;
        int wAnt = 3;
        int jAnt = 1;
        int count1, count2, count3;
        
        count1 = hp / gAnt;
        count2 = (hp % gAnt)/wAnt;
        count3 = ((hp % gAnt)%wAnt)/jAnt;
        
        answer = count1 + count2 + count3;
        return answer;
    }
}