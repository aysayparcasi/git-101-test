package myexamples;

import java.util.Scanner;

public class BaklavaDilimiDeseni {

	public static void main(String[] args) {
		
		    Scanner scanner = new Scanner(System.in);
		int i,k,n,j,l,m;
		System.out.println("Sayi giriniz");
		n=scanner.nextInt();
		   for (i=1;i<=n;i++)//Bu d�ng�m�zde baklava dilimimizin �st k�sm�n� yap�yoruz. 
		            {
		   for (k=n;k>i;k--)//bu for d�ng�m�z ekran ��kt�s�n�n sol taraf�ndaki bo�luklar� ayarl�yor.
		            {
		        System.out.print(" ");
		                }
		   for (j = 1; j <=i ; j++)//bu for d�ng�m�zde ise y�ld�z �eklimizi ��kart�yor ve y�ld�zlar�n aras�ndaki bo�lu�u ayarl�yor
		                {
		        System.out.print("*"+" ");
		                }
		        System.out.println();
		            }
		//bu d�ng�m�z ile baklava diliminin alt kk�s�m�n� yap�yoruz
		    for (k=1;k<=n;k++)
		            {
		    for (l =1 ; l <=k; l++)//d�ng�m�z ile baklava diliminin alt k�s�m�n�n sol taraf�ndaki bo�luklar� belirtiyoruz. 
		                {
		        System.out.print(" ");
		                }
		    for (m = n; m >k ; m--)//bu d�ng�m�z ile baklava diliminin alt k�s�m�ndaki y�ld�zlar� ve aras�ndaki bo�luklar� belirtiyoruz.
		                {
		        System.out.print("*"+" ");
		                }
		        System.out.println();
		            }
	}

}
