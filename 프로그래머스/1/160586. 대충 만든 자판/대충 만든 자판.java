import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        // map 이니까 map을 써보자
        HashMap<Character, Integer> newKeymap = new HashMap<>();

        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                char c = key.charAt(i);
                
                // 이미 맵에 존재한다면 i를 통해 더 작은 값으로 value를 변경
                if (newKeymap.containsKey(c)) {
                    newKeymap.put(c, Math.min(newKeymap.get(c), i +1));
                } else {
                    // 맵에 존재하지 않는다면 새로 map에 생성
                    newKeymap.put(c, i+1);
                }
            }
        }
        
        int[] answer = new int[targets.length];

        // 목표 문자열 작성 최소 횟수 계산
        for (int t = 0; t < targets.length; t++) {
            String target = targets[t];
            int result = 0;

            for (int i = 0; i < target.length(); i++) {
                char c = target.charAt(i);

                if (!newKeymap.containsKey(c)) {
                    // 목표 문자열을 만들 수 없는 경우
                    result = -1;
                    break;
                } else {
                    result += newKeymap.get(c);
                }
            }
            answer[t] = result;
        }

        return answer;
    }
}