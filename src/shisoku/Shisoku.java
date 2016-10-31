package shisoku;
import java.util.Scanner;
public class Shisoku {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("input number m>");
		int m =Integer.parseInt(scan.next());
		System.out.println("input number n>");
		int n =Integer.parseInt(scan.next());
		System.out.println("m+n="+(m+n));
		System.out.println("m-n="+(m-n));
		System.out.println("m*n="+(m*n));
		System.out.println("m€n‚Ì¤"+(m/n));
		System.out.println("m€n‚Ì‚ ‚Ü‚è"+(m-n));
	}

}
