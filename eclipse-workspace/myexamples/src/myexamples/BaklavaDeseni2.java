package myexamples;
import java.util.Scanner;

public class BaklavaDeseni2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = 0, b, c, d, e, i;
		System.out.println("enter number:");
		i = scan.nextInt();

		for (i = 1; i <= a; i++) { // i=i n=a
			for (b = a; b > i; b--) { // k=b
				System.out.print(" ");
			}

			for (c = 1; c <= i; c++) {// j=c
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		for (b = 1; b <= a; b++) {
			for (d = 1; d <= b; d++) {// l=d
				System.out.print(" ");
			}
			for (e = a; e > a; e--) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

	

	}

}
