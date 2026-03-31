class Solution {
    public int solution(int a, int b) {
        StringBuilder temp = new StringBuilder();
        temp.append(a).append(b);
        int ab = Integer.parseInt(temp.toString());
        int TwoAb = 2 * a * b;
        return Math.max(ab, TwoAb);
    }
}