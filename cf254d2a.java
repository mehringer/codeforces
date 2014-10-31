import java.util.Scanner;

public class cf254d2a {
    public static void main(String[] args) {
        //have hash with p buckets, n nums into
        //ith to h(i) with h hahs function h(x) = x mod p
        //can only have 1 element per bucket
        Scanner sc= new Scanner(System.in);
        int p= Integer.parseInt(sc.next());
        int n= Integer.parseInt(sc.next());
        int[] tmp= new int[n];
        for(int i= 0; i < n; i++) {
            tmp[i]= Integer.parseInt(sc.next());
        }
        
        boolean[] arr= new boolean[p];
        for(int i= 0; i < n; i++) {
            
            if(arr[(tmp[i] % p)]) {
                System.out.println("" + (i+1));
                return;
            }
            else arr[(tmp[i] % p)] = true;
        }
        
        System.out.println("-1");
    }
}