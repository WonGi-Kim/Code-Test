import java.util.*;

class Main {
    public void sol(int a, int b) {
        System.out.println(a-b);
    }
    
    public static void main(String[] args) {
        Main sol = new Main();
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        sol.sol(a,b);
    }
}