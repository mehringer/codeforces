import java.util.Scanner;

public class cf249d2a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int groups = Integer.parseInt(sc.next());
        if (groups == 0) {
            System.out.println("0");
            return;
        }
        int busSize = Integer.parseInt(sc.next());
        int[] people = new int[groups];
        int total = 0;
        for (int i = 0; i < groups; i++) {
            people[i] = Integer.parseInt(sc.next());
            total += people[i];
        }
        
        int bused = 0;
        int trips = 0;
        while (bused < total) {
            int open = busSize;
            trips++;
            
            for (int i = 0; i < groups; i++){
                if (people[i] > 0) {
                    if (people[i] <= open) {
                        open = open - people[i];
                        bused += bused + people[i];
                        people[i] = -1;
                    }
                }
                
            }
        }
        System.out.println(trips);
        
        
    }
}