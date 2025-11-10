class Solution {
    public String solution(String s, int n) {
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                result.append(' ');
            } else if (Character.isUpperCase(c)) {
                char shifted = (char) ((c - 'A' + n) % 26 + 'A');
                result.append(shifted);
            } else if (Character.isLowerCase(c)) {
                char shifted = (char) ((c - 'a' + n) % 26 + 'a');
                result.append(shifted);
            }
        }

        return result.toString();
    }
}