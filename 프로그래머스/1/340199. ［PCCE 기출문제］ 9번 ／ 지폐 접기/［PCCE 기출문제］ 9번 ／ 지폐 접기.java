import java.util.*;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        // 계속 접어야 하니까 반복문 사용
        while(true) {
            // 지갑보다 작아야 함
            if(Math.max(wallet[0], wallet[1]) < Math.max(bill[0], bill[1]) || 
               Math.min(wallet[0], wallet[1]) < Math.min(bill[0], bill[1])) {
                if(bill[0] > bill[1]){
                    bill[0] = bill[0]/2;
                    bill[1] = bill[1];
                    answer++;
                }
                else if(bill[0] < bill[1]){
                    bill[0] = bill[0];
                    bill[1] = bill[1]/2;
                    answer++;
                }
            }
            // 한 번 접는 과정이 끝날 때 마다 bill의 요소를 swap해서 검사해보기
            if(Math.max(wallet[0], wallet[1]) >= Math.max(bill[0], bill[1]) & 
               Math.min(wallet[0], wallet[1]) >= Math.min(bill[0], bill[1])) {
                break;
            }
        }
        return answer;
    }
}