class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder answer = new StringBuilder(my_string);
        
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            
            // 자바 범위 : 시작 포함, 끝은 미포함
            String temp = answer.substring(s, e + 1);
            // 뒤집기
            StringBuilder reversed = new StringBuilder(temp).reverse();
            // 갈아끼우기
            answer.replace(s, e + 1, reversed.toString());
        }
        return answer.toString();
    }
}