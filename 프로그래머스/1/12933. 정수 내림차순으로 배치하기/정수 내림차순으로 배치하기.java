import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public long solution(long n) {
      return Long.parseLong(
        Arrays.stream(String.valueOf(n).split(""))
          .sorted(Comparator.reverseOrder())
          .reduce("", (a,b) -> a+b)
      );
    }
}