import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < a.length(); i++) {
            // 특정 위치 i번째의 문자 가져오기
            char c = a.charAt(i);
            
            if (Character.isUpperCase(c)) {
                // 대문자일 경우, 소문자로 변경
                result.append(Character.toLowerCase(c));
            } else {
                // 소문자일 경우, 대문자로 변경
                result.append(Character.toUpperCase(c));
            }
        }
        
        System.out.println(result.toString());
    }
}