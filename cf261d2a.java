import java.util.Scanner;

public class cf261d2a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x1= Integer.parseInt(sc.next()); int y1= Integer.parseInt(sc.next());
        int x2= Integer.parseInt(sc.next()); int y2= Integer.parseInt(sc.next());
        
        int x3; int y3;
        int x4; int y4;
        
        //case 1, on at least 1 same axis
        if (x1 == x2) { //both on x axis
            y3= y1; y4= y2;
            int side= Math.abs(y1-y2);
            x3= x1+ side;
            x4= x2 + side;
        }
        else if (y1 == y2) { //both on y axis
            x3= x1; x4= x2;
            
            int side= Math.abs(x1 - x2);
            y3= y1 + side;
            y4= y2 + side;
            
        }
        else {//case 2, on different axis
            int side= Math.abs(x1 - x2);
            if (side != Math.abs(y1 - y2)) {
                System.out.println( "-1");//if not possible
                return;
            }
            x3= x1;
            y3= y2;
            y4= y1;
            x4= x2;

            
        }
        System.out.println("" + x3 + " " + y3 + " " + x4 + " " + y4 );
        
        //need to check if square possible
    }
}