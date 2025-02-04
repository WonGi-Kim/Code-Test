import java.util.*;
class Solution {
    public int solution(int[] mats, String[][] park) {
        int parkWidth = park.length;
        int parkHeight = park[0].length;
        
        Arrays.sort(mats); // 돗자리 크기 정렬 (큰 것부터 탐색하기 위해)
        
        // 가장 큰 돗자리부터 확인
        for (int k = mats.length - 1; k >= 0; k--) {
            int matSize = mats[k];

            for (int i = 0; i <= parkWidth - matSize; i++) {
                for (int j = 0; j <= parkHeight - matSize; j++) {
                    
                    boolean canPlace = true;
                    
                    for (int x = i; x < i + matSize; x++) {
                        for (int y = j; y < j + matSize; y++) {
                            if (!park[x][y].equals("-1")) {
                                canPlace = false;
                                break;
                            }
                        }
                        if (!canPlace) break;
                    }
                    
                    if (canPlace) {
                        return matSize; // 가장 큰 돗자리 찾으면 즉시 반환
                    }
                }
            }
        }
        
        return -1; // 돗자리를 깔 수 없는 경우
    }
}
