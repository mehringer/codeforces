import java.util.Scanner;

public class p1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		if (m > n) {
			System.out.println("-1");
			return;
		}

		int mini = (n/2) + (n%2);
		while (mini <= n){
			if (mini % m == 0) {
				System.out.println("" + mini);
				return;
			}
			else {
				mini++;
			}
		}


	}
}