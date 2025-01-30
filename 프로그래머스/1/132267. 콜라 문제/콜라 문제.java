class Solution {
    public int solution(int a, int b, int n) {
        int totalEarned = 0;

        while (n >= a) { // 빈 병이 a개 이상일 때만 교환 가능
            int newCoke = (n / a) * b; // 새로 받을 콜라 수
            totalEarned += newCoke; // 총 받은 콜라 개수 업데이트
            n = newCoke + (n % a); // 새 빈 병 개수 업데이트
        }

        return totalEarned;
    }
}