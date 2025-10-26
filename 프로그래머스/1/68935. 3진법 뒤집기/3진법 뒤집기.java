class Solution {
    public int solution(int n) {
        String ternary = Integer.toString(n, 3);
        
        String reversed = new StringBuilder(ternary).reverse().toString();
        
        int result = Integer.parseInt(reversed, 3);
        
        return result;
    }
}