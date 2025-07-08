class Solution {
    public int solution(int num1, int num2) {
        boolean booleanNum1 = num1>=-50000 && num1 <=50000;
        boolean booleanNum2 = num2>=-50000 && num2 <=50000;

        int answer = 0;
        if(booleanNum1&&booleanNum2) {
            answer = num1-num2;
        }
        return answer;
    }
}