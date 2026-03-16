class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        // my_string 앞부분 자르기
        String before = my_string.substring(0, s);
        // my_string 뒷부분 시작위치 세팅
        int index_after = s + overwrite_string.length();
        // my_string 뒷부분 자르기
        String after = my_string.substring(index_after);
        
        // 문자열 조합
        answer = before + overwrite_string + after;
        return answer;
    }
}