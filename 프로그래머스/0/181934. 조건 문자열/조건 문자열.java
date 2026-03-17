class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        String operator = ineq + eq;
        
        switch (operator) {
            case ">=": return n >= m ? 1:0;
            case "<=": return n <= m ? 1:0;
            case "<!": return n < m ? 1:0;
            case ">!": return n > m ? 1:0;
            default : return 0;
        }
    }
}