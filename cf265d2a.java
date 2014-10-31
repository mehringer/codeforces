import java.util.Scanner;

public class cf265d2a {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		String num= sc.next();
		//int counter=0;
		//String num= String.valueOf(n);
		for(int i= 0; i< n; i++) {
			//counter++;
			if (num.charAt(i)=='0') {
				System.out.println(i+1);
			
				return;
			}
		}
		//System.out.println(counter);
		System.out.println(n);
	}

}
