class Solution {
    public String solution(String my_string, int s, int e) {
        // 안뒤집는 앞부분
        String prefix = my_string.substring(0, s);
        // 안뒤집는 뒷부분
        String suffix = my_string.substring(e + 1);
        // 뒤집는 가운데 부분
        String target = my_string.substring(s, e + 1);
        StringBuilder str = new StringBuilder(target);
        String reversed = str.reverse().toString();
        return prefix + reversed + suffix;
    }
}