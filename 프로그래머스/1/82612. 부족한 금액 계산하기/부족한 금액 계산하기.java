class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long cost = 0;
        for (int i = 1; i <= count ; i++) {
            // n + (n*2) + 
            
            cost = cost + (price * i);
        }
        System.out.println(cost);
        if (money > cost) {
            answer = 0;
            return answer;
        }
        if (money < cost) {
            answer = cost - money;
            return answer;
        }
        if (money == cost) {
            answer = 0;
            return answer;
        }
        return answer;
    }
}


// 반례
// 입력값 : 2500, 4 ,2500
// 기대값 : 7815624996

