import java.util.Scanner;

class Solution {
    public void solution(int a, int b) {
        String star = new String();
        
        for(int i = 0; i < b; i++) {
            for(int j = 0; j < a; j++) {
                star = star + "*";
            }
            System.out.println(star);
            star = "";
        }
    } 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Solution sol = new Solution();
        sol.solution(a,b);
    }
}