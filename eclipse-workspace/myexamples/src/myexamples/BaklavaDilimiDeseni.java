package myexamples;

import java.util.Scanner;

public class BaklavaDilimiDeseni {

	public static void main(String[] args) {
		
		    Scanner scanner = new Scanner(System.in);
		int i,k,n,j,l,m;
		System.out.println("Sayi giriniz");
		n=scanner.nextInt();
		   for (i=1;i<=n;i++)//Bu döngümüzde baklava dilimimizin üst kýsmýný yapýyoruz. 
		            {
		   for (k=n;k>i;k--)//bu for döngümüz ekran çýktýsýnýn sol tarafýndaki boþluklarý ayarlýyor.
		            {
		        System.out.print(" ");
		                }
		   for (j = 1; j <=i ; j++)//bu for döngümüzde ise yýldýz þeklimizi çýkartýyor ve yýldýzlarýn arasýndaki boþluðu ayarlýyor
		                {
		        System.out.print("*"+" ");
		                }
		        System.out.println();
		            }
		//bu döngümüz ile baklava diliminin alt kkýsýmýný yapýyoruz
		    for (k=1;k<=n;k++)
		            {
		    for (l =1 ; l <=k; l++)//döngümüz ile baklava diliminin alt kýsýmýnýn sol tarafýndaki boþluklarý belirtiyoruz. 
		                {
		        System.out.print(" ");
		                }
		    for (m = n; m >k ; m--)//bu döngümüz ile baklava diliminin alt kýsýmýndaki yýldýzlarý ve arasýndaki boþluklarý belirtiyoruz.
		                {
		        System.out.print("*"+" ");
		                }
		        System.out.println();
		            }
	}

}
