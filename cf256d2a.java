import java.util.Scanner;

public class cf256d2a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=  Integer.parseInt(sc.next()) + Integer.parseInt(sc.next())
            + Integer.parseInt(sc.next());
        int b= Integer.parseInt(sc.next()) + Integer.parseInt(sc.next()) +
            Integer.parseInt(sc.next());
        int n= Integer.parseInt(sc.next());
        
        int need= 0;
        need= need + (a/5);
        if (a% 5 > 0) need++;
        need= need + (b/10);
        if (b%10 > 0) need++;
        
        if (need <= n) System.out.println("YES");
        else System.out.println("NO");
        
    }
}