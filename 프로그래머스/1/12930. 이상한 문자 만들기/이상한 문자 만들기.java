class Solution {
    public String solution(String s) {
        // 공백을 기준으로 단어를 나누되, 연속된 공백도 유지하기 위해 `split(" ", -1)` 사용
        String[] newString = s.split(" ", -1);
        
        // 결과를 담을 StringBuilder 생성
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < newString.length; i++) {
            StringBuilder split = new StringBuilder();

            for (int j = 0; j < newString[i].length(); j++) {
                char c = newString[i].charAt(j);
                if (j % 2 == 0) {
                    split.append(Character.toUpperCase(c)); // 짝수 인덱스: 대문자
                } else {
                    split.append(Character.toLowerCase(c)); // 홀수 인덱스: 소문자
                }
            }

            answer.append(split);
            if (i < newString.length - 1) {
                answer.append(" "); // 단어 간 공백 유지
            }
        }

        return answer.toString();
    }
}
