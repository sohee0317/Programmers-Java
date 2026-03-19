import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stkList = new ArrayList<>();
        int i = 0;
        
        while (i < arr.length) {
            if (stkList.isEmpty()) {
                // 빈 배열
                stkList.add(arr[i]);
                i++;
            } else {
                // 마지막 원소
                int lastNo = stkList.get(stkList.size() - 1);
                
                if (lastNo < arr[i]) {
                    // 마지막 원소가 arr[i]보다 작을 때
                    stkList.add(arr[i]);
                    i++;
                } else {
                    // 마지막 원소가 arr[i]보다 크거나 같을 때
                    stkList.remove(stkList.size() - 1);
                }
            }
        }
        
        int[] stk = new int[stkList.size()];
        for (int j = 0; j < stkList.size(); j++) stk[j] = stkList.get(j);
        return stk;
    }
}