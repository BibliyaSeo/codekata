class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        // 제한사항이 값을 저것만 넣는다는 소리인 것 같아서 앞으로는 숫자에 대한 if문 안 넣을 예정...
        if(num1 == num2) {
            answer = 1;
        } else {
            answer = -1;
        }
        return answer;
    }
}