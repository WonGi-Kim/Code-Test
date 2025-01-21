import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            // 1. arr1[i], arr2[i]를 2진수 문자열로 변환
            String binary1 = Integer.toBinaryString(arr1[i]);
            String binary2 = Integer.toBinaryString(arr2[i]);

            // 2. n 길이에 맞춰 앞에 0 채우기
            binary1 = String.format("%" + n + "s", binary1).replace(' ', '0');
            binary2 = String.format("%" + n + "s", binary2).replace(' ', '0');

            // 3. StringBuilder를 사용하여 OR 연산 수행
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (binary1.charAt(j) == '1' || binary2.charAt(j) == '1') {
                    sb.append("#"); // 하나라도 1이면 벽
                } else {
                    sb.append(" "); // 둘 다 0이면 공백
                }
            }

            // 4. 결과 저장
            answer[i] = sb.toString();
        }

        return answer;
    }
}
