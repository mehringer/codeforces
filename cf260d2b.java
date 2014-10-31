import java.util.Scanner;
import java.math.*;

public class cf260d2b {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float n= Float.parseFloat(sc.next());
        
        if (n < 0.5) System.out.println("4");
        else if (n < 1.5) System.out.println("0");
        
        //1 will always be 1


        //float biggy= n % ((float) 100000000000000.0);
        float bigMod4= n % ((float) 4.0);
        
        
        int twos= 1;
        int threes=1;
        int fours= 1;
        
        if (bigMod4 < 0.5) {
            twos= 6; threes= 1;
        }
        else {
            for (float i= 0.0f; i < bigMod4; i= i + 1.f) {
                twos= (twos * 2) % 10;
                threes= (threes * 3) % 10;
                
            }
        }
        
        float bigMod2= n % ((float) 2.0);
        if (bigMod2 < 0.5) fours= 6;
        else fours= 4;
        
        
        int result= (twos + threes + fours + 1) % 5;
        System.out.println("" + result);

        
        
        //want to get something mod 5, only care about last digit
    }
}