class Solution {
    public int solution(int[] numbers) {
        int total = 45;
        for (int i = 0; i < numbers.length; i++) {
            total = total - numbers[i];
        }
        return total;
    }
}