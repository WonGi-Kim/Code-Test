import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int min = Integer.MAX_VALUE;

        // 1. 가장 작은 숫자 추출
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }

        // 2. 가장 작은 숫자를 제외한 ArrayList 생성
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            if(i != min){
                list.add(i);
            }
        }

        // 3. ArrayList 를 배열로 변환
        if(list.size() == 0){
            int[] answer = {-1};
            return answer;
        }else{
            int[] answer = new int[list.size()];
            for(int i=0; i<list.size(); i++){
                answer[i] = list.get(i);
            }
            return answer;
        }
    }
}