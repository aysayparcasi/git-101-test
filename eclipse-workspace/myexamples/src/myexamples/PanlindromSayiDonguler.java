/*Java da kullanýcýnýn girdiði deðerin tersini alarak girilen deðerin tersine eþit olup
olmadýðýný bulduran program kodu. Java palindrom sayý bulma örneði aþaðýdadýr. 333,696,121,4444,1441*/

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
