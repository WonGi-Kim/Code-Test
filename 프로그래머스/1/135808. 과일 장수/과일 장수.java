import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        List<Integer> scores = new ArrayList<>();
        List<Integer> box = new ArrayList<>();
        for(int s:score) {
            scores.add(s);
        }
        Collections.sort(scores);
        for(int i = scores.size() - 1; i >= 0; i--) {
            if(box.size() < m){
                box.add(scores.get(i));
                continue;
            } else {
                int min = box.get(m-1);
                answer += min * m;
                box.clear();
                box.add(scores.get(i));
            }
        }
        if(box.size() == m) {
            int min = box.get(m-1);
            answer += min * m;
        }
        return answer;
    }
}