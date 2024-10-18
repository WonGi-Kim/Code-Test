class Solution {
    public String solution(int n) {
        StringBuilder myString = new StringBuilder();
        
        for (int i = 0 ; i < n ; i++) {
            if (i % 2 == 0) {
                myString.append("수");
            } else {
                myString.append("박");
            }
        }
        
        return myString.toString();
    }
}