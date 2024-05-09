class Solution {
    public String solution(String phone_number) {
        int index = phone_number.length();
        String answer = phone_number.substring(index-4, index);
        StringBuffer starString = new StringBuffer();
        for (int i = 0; i < index-4; i++) {
            starString.append("*");
        }
        starString = starString.append(answer);
        return starString.toString();
    }
}