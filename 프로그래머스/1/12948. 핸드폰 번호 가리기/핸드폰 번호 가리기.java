class Solution {
    public String solution(String phone_number) {
        int maskLength = phone_number.length() - 4;
        String mask = "";
        for (int i = 0; i < maskLength; i++) {
            mask += "*";
        }

        return mask + phone_number.substring(maskLength);
    }
}