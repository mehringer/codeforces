import java.util.Scanner;

public class cf263d2a {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//get all input into an array
		int n= sc.nextInt();
		//int n= Integer.parseInt(sc.nextLine());
		String[] board= new String[n];
		for (int i=0; i< n; i++) {
			board[i]= sc.next();
		}
		
		//check all 4 directions for each cell, send out ���NO��� if odd number
		for (int row= 0; row < n ; row++) {
			for (int col= 0; col < n; col++) {
				if(!even(board, row, col, n)) {
					System.out.println("NO");
					return;
				}
			}
		}
		//otherwise they all pass

		System.out.println("YES");
	}

	//check all 4 directions, return: even number of ���o���s bordering 
	public static boolean even(String[] board, int row, int col, int n) {
		int seenOs= 0;
		//above
		if (row > 0 && board[row-1].charAt(col) == 'o') seenOs++;
		//below
		if (row < n-1 && board[row+1].charAt(col) == 'o') seenOs++;
		//left
		if (col > 0 && board[row].charAt(col-1) == 'o') seenOs++;
		//right
		if (col < n-1 && board[row].charAt(col+1)== 'o') seenOs++;
		
		return (seenOs % 2) == 0;

				

	}
}