import java.util.*;

public class Solution {
    public int solution(int n) {
        String strNum = String.valueOf(n);
        int sum = 0;
        for(int i = 0; i < strNum.length(); i++) {
            sum += strNum.charAt(i)-'0';
        }
        return sum;
    }
}