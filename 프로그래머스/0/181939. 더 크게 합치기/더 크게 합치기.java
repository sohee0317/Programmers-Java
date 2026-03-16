class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String abStr = "" + a + b;
        String baStr = "" + b + a;
        
        int abNo = Integer.parseInt(abStr);
        int baNo = Integer.parseInt(baStr);
        
        if (abNo > baNo) {
            answer = abNo;
        } else {
            answer = baNo;
        }
        return answer;
    }
}