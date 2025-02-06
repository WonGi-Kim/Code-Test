class Solution {
    public int solution(int n) {
        int answer = 0;
        String three = new String();
        
        // 10 -> 3 진법 변환
        three = Integer.toString(n,3);
        
        // 앞뒤 반전 (1)
        StringBuilder reverse = new StringBuilder(three);
        reverse = reverse.reverse();
        
        // 3 -> 10 진법 변환
        String demical = new String(reverse.toString());
        answer = Integer.parseInt(demical, 3);
        
        // 앞뒤 반전 (2)
        String reverse2 = new String();
        for (int i = three.length() - 1; i >= 0; i--) {
            reverse2 = reverse2 + three.charAt(i);        
        }
        // 3 -> 10 진법 변환 2
        String demical2 = new String(reverse2.toString());
        answer = Integer.parseInt(demical2, 3);

        return answer;
    }
}