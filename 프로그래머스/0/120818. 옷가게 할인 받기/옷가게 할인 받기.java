class Solution {
    public int solution(int price) {
        double realPrice = price;
        int answer = 0;
        if (realPrice >= 100000 && realPrice <= 299999) {
            realPrice = realPrice - (realPrice * 0.05);
        } else if (realPrice >= 300000 && realPrice <= 499999) {
            realPrice = realPrice - (realPrice * 0.1);
        } else if (realPrice >= 500000) {
            realPrice = realPrice - (int) (realPrice * 0.2);
        } else {
            return (int) realPrice;
        }
        System.out.println(realPrice);
        return (int) (realPrice);
    }
}