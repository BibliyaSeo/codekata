class Solution {
    public long solution(int price, int money, int count) {
        long totalPrice = (long) price * count * (count+1) / 2;
        
        long shortage = totalPrice - money;
        
        return Math.max(0, shortage);
    }
}