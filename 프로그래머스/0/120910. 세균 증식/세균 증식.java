class Solution {
    public int solution(int n, int t) {
        // 처음 마리수 n, 경과한 시간 t
        for(int i = 0; i < t ; i++) {
            n = n * 2;
        }
        return n;
    }
}