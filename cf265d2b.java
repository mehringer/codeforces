import java.util.Scanner;

public class cf265d2b {

  public static void main(String[] args){
    Scanner sc =  new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int[] arr = new int[n];
    int lastone = -1;
    for (int i = 0; i < n; i++){
      arr[i] = Integer.parseInt(sc.next());
      if (arr[i] == 1 && lastone < 0) lastone = i;
    }
    if (lastone < 0) {
      System.out.println("0");
      return;
    }
    int moves = 0;
    for (int i = lastone; i < n; i++){
      if (arr[i] == 1){
        if (lastone < i -1) moves++;
        moves++;
        lastone = i;
      }
    }
    System.out.println("" + moves);

  }

}
