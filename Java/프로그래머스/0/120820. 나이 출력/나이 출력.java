class Solution {
    public int solution(int age) {
        int year = 2022;
        int born_year = 0;
        born_year = year - age;
        
        return born_year + 1; // 태어난 연도의 + 1살
    }
}