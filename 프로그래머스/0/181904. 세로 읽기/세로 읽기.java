class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder str = new StringBuilder();
        
        for (int i = c - 1; i < my_string.length(); i += m) {
            str.append(my_string.charAt(i));
        }
        return str.toString();
    }
}