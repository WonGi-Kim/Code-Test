import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d); // 신청 금액을 오름차순 정렬
        int count = 0; // 지원 가능한 부서 수
        
        for (int cost : d) { // 작은 금액부터 예산에서 차감
            if (budget >= cost) { 
                budget -= cost;
                count++;
            } else {
                break; // 예산 부족하면 종료
            }
        }
        
        return count;
    }
}
