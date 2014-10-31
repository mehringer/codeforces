import java.util.Scanner;

public class cf258d2a {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= Integer.parseInt(sc.next());
        int m= Integer.parseInt(sc.next());
        //a goes first
        
        //any move removes an m or an n
        
        if (n == 1 || m == 1) {
            System.out.println("Akshat");
            return;
        }
        /*
        if ((m*n)%2==0) System.out.println("Malvika");
        else System.out.println("Akshat");*/
        
        int min= (n < m ? n : m);
        
        if (min % 2 == 0) System.out.println("Malvika");
        else System.out.println("Akshat");
        
      
    }
}