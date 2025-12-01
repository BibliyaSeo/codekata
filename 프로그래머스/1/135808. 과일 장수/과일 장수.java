import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        int n = score.length;
        int answer = 0;

        for (int i = n - 1; i >= m - 1; i -= m) {
            int p = score[i - (m - 1)];
            answer += p * m;
        }

        return answer;
    }
}