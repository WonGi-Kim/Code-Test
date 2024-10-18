class Solution {
    public String solution(int n) {
        String answer = "수";
        for (int i = 0 ; i < n ; i++) {
            if (i > 0 && answer.charAt(i-1) == '박') {
                answer = answer + "수";
            }
            if (i > 0 && answer.charAt(i-1) == '수') {
                answer = answer + "박";
            }
            // System.out.println(answer);
        }
        return answer;
    }
}