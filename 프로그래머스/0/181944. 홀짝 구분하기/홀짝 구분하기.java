import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n % 2 == 0) {
            // 짝수
            System.out.printf("%d is even\n", n);
        } else {
            // 홀수
            System.out.printf("%d is odd\n", n);
        }
    }
}