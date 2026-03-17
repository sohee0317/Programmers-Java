class Solution {
    public String solution(String code) {
        StringBuilder answer = new StringBuilder();
        int mode = 0;
        
        for (int i = 0; i < code.length(); i++) {
            char temp = code.charAt(i);
            
            if (temp == '1') {
                mode = (mode == 0) ? 1 : 0;
                continue;
            }
            
            if (mode == 0) {
                if (i % 2 == 0) answer.append(temp);
            } else {
                if (i % 2 != 0) answer.append(temp);
            }
        }
        return answer.length() == 0 ? "EMPTY" : answer.toString();
    }
}