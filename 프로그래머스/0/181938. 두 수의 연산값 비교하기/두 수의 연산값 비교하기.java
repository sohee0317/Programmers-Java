class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String abStr = "" + a + b;
        int abNo = Integer.parseInt(abStr);
        
        int abPlus = 2 * a * b;
        
        if (abNo > abPlus) {
            answer = abNo;
        } else if (abNo == abPlus) {
            answer = abNo;
        } else {
            answer = abPlus;
        }
        return answer;
    }
}