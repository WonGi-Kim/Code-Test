import java.util.*;

public class Solution {
    public List<Integer> solution(int []arr) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            if(i == 0) {
                answer.add(arr[i]);
            }
            if(i >= 1) {
                if(arr[i] == arr[i-1]) {
                    continue;
                } else {
                    answer.add(arr[i]);
                }
            }
        }

        return answer;
    }
}