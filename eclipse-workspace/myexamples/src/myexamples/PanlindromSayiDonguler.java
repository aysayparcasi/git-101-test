/*Java da kullan�c�n�n girdi�i de�erin tersini alarak girilen de�erin tersine e�it olup
olmad���n� bulduran program kodu. Java palindrom say� bulma �rne�i a�a��dad�r. 333,696,121,4444,1441*/

package myexamples;

import java.util.Scanner;

public class PanlindromSayiDonguler {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Sayi Giriniz: ");
		int palindrom = s.nextInt();
		int ilkdeger = palindrom;
		int length = String.valueOf(palindrom).length();

		int kalan, deger = 0;
		for (int i = 0; i < length; i++) {

			kalan = palindrom % 10;
			deger = deger * 10 + kalan;
			palindrom = palindrom / 10;

		}
		if(deger == ilkdeger) {
			System.out.println(deger + " Palindrom sayidir.");
		}else {
			System.out.println(deger + " Palindrom sayi degildir.");
		} 

	}

}
