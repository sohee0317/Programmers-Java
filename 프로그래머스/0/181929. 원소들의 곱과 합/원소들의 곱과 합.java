class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum1 = 1;
        int temp = 0;
        int sum2 = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            // 모든 원소들의 곱
            sum1 *= num_list[i];
            
            // 모든 원소들의 합
            temp += num_list[i];
        }
        
        // 모든 원소들의 합의 제곱
        sum2 = temp * temp;
        
        answer = (sum1 < sum2) ? 1 : 0;
        
        return answer;
    }
}