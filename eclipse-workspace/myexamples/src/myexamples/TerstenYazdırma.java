package myexamples;

//import java.awt.GraphicsConfigTemplate;
import java.util.Scanner;

public class TerstenYazd�rma {

	public static void main(String[] args) {
		String original, reverse = "";
		Scanner scan=new Scanner(System.in);
		System.out.println("Tersten �evirmek istedi�iniz c�mleyi giriniz:");
		original=scan.next();
		int length = original.length();
		for(int i=length-1; i>=0;i--)
		reverse = reverse + original.charAt(i);
		System.out.println("c�mlenin tersi: " + reverse);
	}
	
}
