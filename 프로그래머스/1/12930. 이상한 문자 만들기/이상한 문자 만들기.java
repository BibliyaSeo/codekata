public class Solution {
    public String solution(String s) {
        StringBuilder result = new StringBuilder();
        int index = 0; 

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ' ') {
                result.append(' ');
                index = 0;
            } else {
                // 짝수 -> 대문자, 홀수 -> 소문자
                if (index % 2 == 0) {
                    result.append(Character.toUpperCase(ch));
                } else {
                    result.append(Character.toLowerCase(ch));
                }
                index++;
            }
        }

        return result.toString();
    }
}
