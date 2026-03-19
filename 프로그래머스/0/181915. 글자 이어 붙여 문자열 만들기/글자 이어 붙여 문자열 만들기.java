class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder answer = new StringBuilder();
        
        for (int idx : index_list) {
            char c = my_string.charAt(idx);
            answer.append(c);
        }
        return answer.toString();
    }
}