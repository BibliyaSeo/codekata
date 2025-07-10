class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        
        if(num1 > 0 && num1 <= 100 && num2 > 0 && num2 <= 100) {
       
                return num1/num2;
        }
        System.out.println("1~100까지의 숫자를 입력해 주세요. 처리 불가로 답을 0으로 표현합니다.");
        return answer;
    }
}