import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dice = {a, b, c, d};
        Arrays.sort(dice);
        
        // 네 주사위 숫자가 모두 같을 때
        if (dice[0] == dice[3]) {
            return 1111 * dice[0];
        }
        // 세 주사위에서 나온 숫자만 같을 때
        else if (dice[0] == dice[2]) {
            // 앞의 3개가 같을 때
            return (int) Math.pow(10 * dice[0] + dice[3], 2);
        } else if (dice[1] == dice[3]) {
            // 뒤의 3개가 같을 때
            return (int) Math.pow(10 * dice[1] + dice[0], 2);
        }
        // 두 개씩 같은 값일 때
        else if (dice[0] == dice[1] && dice[2] == dice[3]) {
            return (dice[0] + dice[2]) * Math.abs(dice[0] - dice[2]);
        }
        // 두 개만 같은 값을 때
        else if (dice[0] == dice[1]) return dice[2] * dice[3];
        else if (dice[1] == dice[2]) return dice[0] * dice[3];
        else if (dice[2] == dice[3]) return dice[0] * dice[1];
        // 모두 다를 때
        else return dice[0];
    }
}