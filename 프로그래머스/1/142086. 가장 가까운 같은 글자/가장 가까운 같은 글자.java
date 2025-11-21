import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] result = new int[s.length()];
        int[] lastIndex = new int[26];
        Arrays.fill(lastIndex, -1);  

        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';

            if (lastIndex[idx] == -1) {
                result[i] = -1; 
            } else {
                result[i] = i - lastIndex[idx]; 
            }

            lastIndex[idx] = i; 
        }

        return result;
    }
}