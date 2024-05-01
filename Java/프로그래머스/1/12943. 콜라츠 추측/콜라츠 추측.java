class Solution {
    public int solution(long num) {
        int answer = 0;
        int count = 0;
        long input = num;
        while(num != 1) {
            if(num % 2 == 0) {
                num = num / 2;
                count++;
            } else if (num % 2 != 0) {
                num = (num * 3) + 1;
                count++;
            } 
            if (count >= 500) {
                count = -1;
                break;
            }
        }
        if (input == 0){
            return -1;
        }
        
        return count;
    }
}