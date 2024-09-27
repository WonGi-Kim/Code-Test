import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int i = 0, j = 0;
        
        // goal의 각 단어가 cards1 또는 cards2에서 순서대로 있는지 확인
        for (String word : goal) {
            if (i < cards1.length && cards1[i].equals(word)) {
                i++; // cards1에서 단어를 사용
            } else if (j < cards2.length && cards2[j].equals(word)) {
                j++; // cards2에서 단어를 사용
            } else {
                return "No"; // 두 카드 뭉치 어디에도 없으면 No
            }
        }
        
        return "Yes"; // 모든 단어를 순서대로 만들 수 있으면 Yes
    }
}
