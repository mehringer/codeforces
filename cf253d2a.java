import java.util.Scanner;
import java.util.HashSet;


public class cf253d2a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String first=  sc.nextLine();
        if(first.length() < 3) {
            System.out.println("0");
            return;
        }
        String tmp=  first.substring(1, first.length() -1);
        String[] arr= tmp.split(", ");
        HashSet<String> hs= new HashSet<String>(arr.length * 2);
        int counter= 0;
        for(int i= 0; i < arr.length; i++) {
            if (!(hs.contains(arr[i])) ) {
                counter++;
                hs.add(arr[i]);
            }
            
        }
        System.out.println( "" + counter);
    }
}
