// class Solution {
//     public int[] solution(int n, int k) {
//         int[] answer = new int[n/k];
//         int l = 0;
        
//         // n 이하 정수 중 k의 배수를 배열에 저장
//         for(int i = k; i <= n; i++){
//             if(i % k == 0){
//                 answer[l] = i;
//                 l++;
//             }
//         }
        
//         return answer;
//     }
// }

class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        int l = 0;
        
        // n 이하 정수 중 k의 배수를 배열에 저장
        for(int i = k; i <= n; i += k){
            answer[l] = i;
            l++;
        }
        
        return answer;
    }
}