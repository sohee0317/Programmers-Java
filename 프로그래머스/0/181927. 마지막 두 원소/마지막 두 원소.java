class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        int temp = 0;
        
        // 데이터 복사
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        
        if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
            // 마지막 원소가 그 전 원소보다 클 때
            temp = num_list[num_list.length - 1] - num_list[num_list.length - 2];
        } else {
            // 마지막 원소가 그 전 원소보다 크지 않을 때
            temp = num_list[num_list.length - 1] * 2;
        }
        
        answer[answer.length - 1] = temp;
        
        return answer;
    }
}