import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        // System.out.println(honor.length);
        
        // 명예의 전당에 점수를 담을 배열
        ArrayList<Integer> honor = new ArrayList<>();

        // score를 다룰 수 있도록 동적 배열로 변경
        ArrayList<Integer> scores = new ArrayList<>();
        for(int s : score) {
            scores.add(s);
        }
        
        // 결과 값을 담을 동적 배열 역시 생성
        ArrayList<Integer> presentateScore = new ArrayList<>();
        
        // 일 수 만큼 반복을 돌리면서 명예의 전당에 점수를 삽입
        for(int scorePerDay : scores) {
            // k 크기보다 작다면 그대로 honor에 포함시킨다.
            honor.add(scorePerDay);
            
            if(honor.size() <= k) {
                
                // honor에서 최소값을 발표한다.
                presentateScore.add(Collections.min(honor));
            }
            // k의 크기보다 size가 크게 들어왔다면 honor 내부의 값과 scorePerDay를 비교하여 큰 값을 honor에 포함시킨다.
            if(honor.size() > k) {
                // 가장 작은 값은 삭제하고
                honor.remove(Collections.min(honor));
                // 두 번째 값을 발표한다.
                presentateScore.add(Collections.min(honor));
            }
        }
        
        // Stream을 이용하여 변경
        int[] answer = presentateScore.stream()
                                      .mapToInt(Integer::intValue)
                                      .toArray();
        return answer;
    }
}