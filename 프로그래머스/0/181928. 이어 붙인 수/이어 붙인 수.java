class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String evenStr = "";
        String oddStr = "";
        
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                // 짝수
                evenStr += num_list[i];
            } else {
                // 홀수
                oddStr += num_list[i];
            }
        }
        
        int evenNum = Integer.parseInt(evenStr);
        int oddNum = Integer.parseInt(oddStr);
        
        answer = evenNum + oddNum;
        
        return answer;
    }
}