import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import java.math.BigInteger;

public class p2{

	public static ArrayList<Integer> allpos = new ArrayList<Integer>();

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char[] inp = (sc.next()).toCharArray();
		char[] s2 = (sc.next()).toCharArray();
		int target = 0;
		for (char c : inp) {
			if (c == '+') {
				target++;
			} else if (c == '-'){
				target--;
			}
		}
		int pos = 0;
		int seen = 0;
		for (char c: s2){
			if (c == '+') {
				pos++;
			} else if (c == '-'){
				pos--;
			} else if (c == '?') {
				seen++;
			}

		}

		if (seen == 0){
			if (target == pos) {
				System.out.println(String.valueOf((double) 1));
			} else {
				System.out.println(String.valueOf((double) 0));
			}
			return;
		}

		int needs = target - pos;

		if (Math.abs(needs) > seen){
			System.out.println(String.valueOf((double) 0));
			return;
		}

		recurse(seen, pos);
		int successes=0;
		for (Integer i : allpos){
			if (i == target){
				successes++;
			}
		}
		System.out.println( String.valueOf( ((float) successes)/((long) allpos.size()) ));

	}

	public static void recurse(int seen, int pos){
		if (seen == 1) {
			allpos.add(pos+1);
			allpos.add(pos-1);
		}else {
			p2.recurse(seen-1,pos+1);
			p2.recurse(seen-1,pos-1);
		}

	}

}