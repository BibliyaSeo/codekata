class Solution {
    public double solution(int[] arr) {
        int sum = 0;
        for(int arrs: arr) {
            sum+=arrs;
        }
        return (double) sum/arr.length;
    }
}