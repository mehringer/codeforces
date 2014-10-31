import java.util.Scanner;
// 20 min
public class cf259d2a {
    public static void main(String[] args) {
        //look for int
        int n= new Scanner(System.in).nextInt();
        //instantiate array
        char[][] result=  new char[n][n];
        for (char[] ch: result) {
            for (int i= 0; i < n; i++) {
                ch[i]= '*';
            }
        }
        int lefter= n/2;
        int righter= n/2;
        int changer= -1;
        for (int i = 0; i < n; i++) {
            for (int x=0; x< n; x++) {
                if (x >= lefter && x <= righter) result[i][x]= 'D';
                
            }
            lefter= lefter + changer;
            righter= righter - changer;
            if ( lefter == 0) changer = 1;
        }
        for (char[]  ch: result) {
            for (char c: ch) System.out.print(c);
            System.out.println();
        }
        //switch everything that should be * to star
    }
}