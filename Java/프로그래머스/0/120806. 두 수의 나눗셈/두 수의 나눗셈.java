class Solution {
    public int solution(int num1, int num2) {
        double result;
        result = num1 /(double) num2;
        result = result * 1000;
        int answer = (int) result;
        return answer;
    }
}