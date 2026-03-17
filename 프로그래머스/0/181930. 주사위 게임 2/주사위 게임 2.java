class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int sum1 = a + b + c;
        int sum2 = a*a + b*b + c*c;
        int sum3 = a*a*a + b*b*b + c*c*c;
        
        if (a == b && b == c) {
            //세 숫자가 모두 같을 경우
            answer = sum1 * sum2 * sum3;
        } else if (a == b || b == c || a == c) {
            // 세 숫자 중 두 숫자만 같을 경우
            answer = sum1 * sum2;
        } else {
            // 세 숫자 모두 다를 경우
            answer = sum1;
        }
        
        return answer;
    }
}