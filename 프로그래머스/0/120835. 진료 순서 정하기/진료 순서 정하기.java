import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        // 맵을 하나 만들기
        HashMap<Integer, Integer> newMap = new HashMap<>();
        int x = 0;
        for (int i : emergency) {
            newMap.put(i,x);
            x++;
        }
        // 정렬된 배열 하나 더 만들기
        List<Integer> newList = new ArrayList<Integer>() {{for (int i : emergency) add(i);}};
        // 내림차순 정렬
        Collections.sort(newList, Collections.reverseOrder());
        int y = 1;
        for (int i : newList) {
            if (newMap.containsKey(i)) {
                newMap.replace(i, y);
            }
            y++;
        }
        
        for(int i = 0; i < emergency.length ; i++) {
            int value = newMap.get(emergency[i]);
            emergency[i] = value;
        }
        
        System.out.println(newMap);
        System.out.println(newList);
        return emergency;
    }
}