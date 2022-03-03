package myexamples;

//import java.awt.GraphicsConfigTemplate;
import java.util.Scanner;

public class TerstenYazdırma {

	public static void main(String[] args) {
		String original, reverse = "";
		Scanner scan=new Scanner(System.in);
		System.out.println("Tersten çevirmek istediğiniz cümleyi giriniz:");
		original=scan.next();
		int length = original.length();
		for(int i=length-1; i>=0;i--)
		reverse = reverse + original.charAt(i);
		System.out.println("cümlenin tersi: " + reverse);
	}
	
}
