import java.util.*;
class Solution {
    public int solution(int[] number) {
        // List<Integer> numbers = new ArrayList<>();
        int answer = 0;
        int length = number.length;

        // 3중 루프를 통해 서로 다른 3명의 학생을 선택
        for (int i = 0; i < length - 2; i++) {
            for (int j = i + 1; j < length - 1; j++) {
                for (int k = j + 1; k < length; k++) {
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
}