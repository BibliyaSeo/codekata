class Solution {
    public String solution(int n) {
        String one = "수";
        String two = "박";
        String answer = "";
        
        for(int i = 0; i<n; i++) {
            if(i%2==0) {
                answer += one;
            } else {
                answer += two;
            }
        }
        
        return answer;
    }
}