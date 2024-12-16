import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        // 1. 입력 배열 크기만큼 answer 배열 선언
        int[] answer = new int[num_list.length];
        
        // 2. 스택에 값 저장
        Stack<Integer> newStack = new Stack<>();
        for (int i : num_list) {
            newStack.push(i);
        }
        
        // 3. 스택에서 값을 꺼내 역순으로 answer 배열에 저장
        int index = 0;
        while (!newStack.isEmpty()) {
            answer[index++] = newStack.pop();
        }
        
        return answer;
    }
}
