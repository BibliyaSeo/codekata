class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        double newNum1 = num1;
        double nuwNum2 = num2;
        answer = (int)(newNum1/nuwNum2 * 1000);
        return answer;
    }
}