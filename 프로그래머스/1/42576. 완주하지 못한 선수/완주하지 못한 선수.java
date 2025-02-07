import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> completMap = new HashMap<>();
        
        // completMap 생성
        for(String com : completion) {
            if(!completMap.containsKey(com)) {
                // 동명이인이 없는 경우
                completMap.put(com, 1);
            } else if(completMap.containsKey(com)) {
                // 동명이인이 존재하는 경우
                completMap.put(com, completMap.get(com) + 1);
            }
        }
        
        // 참가자 중에서 완주하지 못한 선수 저장
        for(String part : participant) {
            if(completMap.containsKey(part)) {
                completMap.put(part, completMap.get(part) - 1);
            }
        }
        
        for(String part : participant) {
            // 완주하지 못한 선수 출력
            if(!completMap.containsKey(part)) {
                return part;
            } else if (completMap.get(part) != 0) {
                return part;
            } else {
                continue;
            }
        }

        String answer = "";
        return answer;
    }
}