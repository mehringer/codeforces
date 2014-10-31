// Luke Mehringer codeforces 246a, for practice
// accepted on first attempt, took really long, 20 min
import java.util.Scanner;

public class cf246d2a {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());
    int[] arr= new int[n];
    for (int i = 0; i < n; i++){
      arr[i] = 5 - Integer.parseInt(sc.next());
    }

    int res = 0;
    int count = 0;
    for (int i = n - 1; i >= 0; i--){
      if (arr[i] >= k){
        count++;
        if (count == 3){
          res++;
          count = 0;
        }
      }
    }

    System.out.println(""+res);
  }
}
