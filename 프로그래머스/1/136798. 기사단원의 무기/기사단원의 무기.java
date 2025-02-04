import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int totalIronWeight = 0;

        // 1부터 number까지 기사 번호에 대해 약수 개수 구하기
        for (int i = 1; i <= number; i++) {
            int divisorCount = getDivisorCount(i); // 약수 개수 계산
            
            // 제한 수치를 초과하면 power로 설정
            if (divisorCount > limit) {
                totalIronWeight += power;
            } else {
                totalIronWeight += divisorCount;
            }
        }

        return totalIronWeight;
    }

    // 약수 개수 구하는 함수
    private int getDivisorCount(int num) {
        int count = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                count++; // i가 약수일 때
                if (i != num / i) {
                    count++; // 서로 다른 짝 약수
                }
            }
        }
        return count;
    }
}
