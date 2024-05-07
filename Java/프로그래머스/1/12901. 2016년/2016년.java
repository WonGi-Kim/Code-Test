public class Solution {
    public String solution(int a, int b) {
        String[] daysOfWeek = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};    
        int[] daysOfMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int totalDays = 0;
        for (int i = 0; i < a - 1; i++) {
            totalDays += daysOfMonth[i];
        }
        totalDays += b - 1;
        
        String answer = daysOfWeek[totalDays % 7];
        return answer;
    }
}
