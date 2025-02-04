class Solution {
    public String solution(int[] food) {
        StringBuilder leftSide = new StringBuilder();

        // 음식 개수 처리
        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2; // 각 선수당 먹을 수 있는 개수
            leftSide.append(String.valueOf(i).repeat(count)); // 같은 숫자를 count만큼 추가
        }

        // 오른쪽은 왼쪽을 뒤집은 형태
        String rightSide = leftSide.reverse().toString();

        // 가운데 물(0) 추가 후 최종 문자열 반환
        return leftSide.reverse().toString() + "0" + rightSide;
    }
}
