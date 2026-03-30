import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder answer = new StringBuilder();
        String a = sc.next();
        String b = sc.next();
        answer.append(a).append(b);
        
        System.out.print(answer.toString());
    }
}