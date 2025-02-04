import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int n = friends.length;
        Map<String, Integer> indexMap = new HashMap<>(); // 이름 → 인덱스 매핑
        int[][] giftHistory = new int[n][n]; // 선물 주고받은 기록 (i -> j)
        int[] giveCount = new int[n]; // 친구가 준 선물 개수
        int[] takeCount = new int[n]; // 친구가 받은 선물 개수

        // 친구 리스트 인덱싱
        for (int i = 0; i < n; i++) {
            indexMap.put(friends[i], i);
        }

        // 선물 주고받은 기록 저장
        for (String gift : gifts) {
            String[] parts = gift.split(" ");
            int giverIdx = indexMap.get(parts[0]);
            int receiverIdx = indexMap.get(parts[1]);

            giftHistory[giverIdx][receiverIdx]++; // giver -> receiver 기록
            giveCount[giverIdx]++;
            takeCount[receiverIdx]++;
        }

        // 선물 지수 계산
        int[] giftIndex = new int[n];
        for (int i = 0; i < n; i++) {
            giftIndex[i] = giveCount[i] - takeCount[i];
        }

        // 다음 달 선물 계산
        int[] nextMonthGifts = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (i == j) continue;

                int giftAtoB = giftHistory[i][j]; // A -> B 준 개수
                int giftBtoA = giftHistory[j][i]; // B -> A 준 개수

                if (giftAtoB > giftBtoA) {
                    nextMonthGifts[i]++; // A가 B보다 더 많이 줬으면 A가 선물 받음
                } else if (giftAtoB < giftBtoA) {
                    nextMonthGifts[j]++; // B가 A보다 더 많이 줬으면 B가 선물 받음
                } else {
                    // 주고받은 개수가 같으면 선물 지수 비교
                    if (giftIndex[i] > giftIndex[j]) {
                        nextMonthGifts[i]++;
                    } else if (giftIndex[i] < giftIndex[j]) {
                        nextMonthGifts[j]++;
                    }
                }
            }
        }

        // 가장 많이 받는 친구의 선물 개수 반환
        return Arrays.stream(nextMonthGifts).max().getAsInt();
    }
}
