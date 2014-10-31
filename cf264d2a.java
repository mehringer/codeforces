import java.util.Scanner;
import java.util.ArrayList;

public class cf264d2a {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String ns= sc.nextLine();
		String[] tmp= ns.split(" ");
		int n= Integer.parseInt(tmp[0]); //types
		int s= Integer.parseInt(tmp[1]); //dollars
		
		int[][] sugar= new int[n][2];
		
		for(int i = 0; i < n; i++) {
			String inp= sc.nextLine();
			String[] splitter= inp.split(" ");
			sugar[i][0] = Integer.parseInt(splitter[0]);
			sugar[i][1] = Integer.parseInt(splitter[1]);
			
		}
		
		int maxi= 0;
		boolean canBuy= false;
		for(int[] line: sugar) {
			if (line[0] <= s) {
				if (line[1] ==0) canBuy=true;
				else if ((100- line[1]> maxi && line[1] != 0 && line[0] < s) ) {
					maxi= 100 - line[1];
					canBuy=true;
				}
			}
		}
		if(canBuy) {
			System.out.println(maxi);

		}
		else System.out.println("-1");
		
		
		
		/*
		Scanner sc= new Scanner(System.in).useDelimiter(" ");
		int n= 0; int s= 0;
		int[] tmp= new int[2];
		for (int i= 0; i < n ; i ++) {
			int a=0;
			while (sc.hasNext()) {
				tmp[a]= sc.nextInt();
				a++;
			}
		}
		n= tmp[0]; s= tmp[1];
		
		int[][] collect= new int[n][2];
		for (int h=0; h < n; h++) {
			int a= 0;
			while (sc.hasNext()) {
				collect[h][a]= sc.nextInt();
				a++;
			}
		}
		
		
		
		int maxi= 0;
		for (int j= 0; j < n ; j++) {
			if (collect[j][0] < s) {
				if (maxi < collect[j][1]){
					maxi= collect[j][1];
				}
			}
		}
		System.out.println(maxi);
		*/
		
	}
}
