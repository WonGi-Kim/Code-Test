class Solution {
    public int solution(int n, int m, int[] section) {
        int count = 0;  // 최소 페인트칠 횟수
        int current = 0; // 현재 칠해진 마지막 위치

        for (int s : section) {
            if (s > current) { // 아직 칠하지 않은 구역이면 롤러로 칠함
                count++; 
                current = s + m - 1; // 롤러 길이만큼 오른쪽 끝까지 칠함
            }
        }
        return count;
    }
}