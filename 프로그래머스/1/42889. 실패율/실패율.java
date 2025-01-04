import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        // 실패율 계산을 위한 배열 초기화
        int[] stageCounts = new int[N + 2]; // 각 스테이지에 도달한 플레이어 수
        for (int stage : stages) {
            stageCounts[stage]++;
        }
        
        // 각 스테이지의 실패율 계산
        HashMap<Integer, Double> failureRates = new HashMap<>();
        int totalPlayers = stages.length; // 전체 플레이어 수
        
        for (int i = 1; i <= N; i++) {
            if (totalPlayers == 0) {
                failureRates.put(i, 0.0); // 도달한 플레이어가 없으면 실패율 0
            } else {
                double failureRate = (double) stageCounts[i] / totalPlayers;
                failureRates.put(i, failureRate);
                totalPlayers -= stageCounts[i]; // 다음 스테이지로 넘어갈 플레이어 수 감소
            }
        }
        
        // 실패율을 기준으로 스테이지 정렬
        List<Integer> sortedStages = new ArrayList<>(failureRates.keySet());
        sortedStages.sort((a, b) -> {
            double diff = failureRates.get(b) - failureRates.get(a);
            if (diff == 0) {
                return a - b; // 실패율이 같으면 스테이지 번호로 오름차순 정렬
            }
            return diff > 0 ? 1 : -1; // 실패율 내림차순 정렬
        });
        
        // 결과를 배열로 변환
        int[] answer = sortedStages.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}
