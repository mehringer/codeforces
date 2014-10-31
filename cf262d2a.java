import java.util.Scanner;

public class cf262d2a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //String str= sc.nextLine();
        //String[] sa= str.split(" ");
        //int n= Integer.parseInt(sa[0]); int m = Integer.parseInt(sa[1]);
        int n= Integer.parseInt(sc.next());
        int m= Integer.parseInt(sc.next());
        //make loop for n days, but max number increases by 1 on the xm + 1 days
        int days= 0;
        int socks= n;
        //go while have more than zero pairs of socks for the day
        while (socks > 0) {
            days++;
            if (days % m == 0 && days > 0) {
                socks++;
            }
            socks= socks -1;
        }
        System.out.println(days);
    }
}