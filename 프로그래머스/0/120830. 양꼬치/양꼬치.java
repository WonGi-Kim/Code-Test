class Solution {
    public int solution(int n, int k) {
        // 양꼬치 n, 음료수 k
        // 양꼬치 10n = 음료수 1
        int totalYang = n * 12000;
        int totalCola = k * 2000;
        int serviceCola = n / 10;
        int servicePrice = serviceCola * 2000;
        int totalPrice = 0;
        
        totalPrice = (totalYang + totalCola - servicePrice);
        
        return totalPrice;
    }
}