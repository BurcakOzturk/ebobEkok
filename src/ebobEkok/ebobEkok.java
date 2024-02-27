package ebobEkok;

import java.util.Scanner;

public class ebobEkok {

	public static void main(String[] args) {

		int sayi1,sayi2,ebob=1,ekok,hesap,kalan;
		int pay=1,payda=1;
		Scanner input = new Scanner (System.in);
		
		System.out.print("Birinci sayıyı giriniz : ");
		sayi1=input.nextInt();
		
		System.out.print("İkinci sayıyı giriniz : ");
		sayi2=input.nextInt();
		
		if(sayi1>sayi2) { pay=sayi1; payda=sayi2; }
		if(sayi2>sayi1) { pay=sayi2; payda=sayi1; }
		
		while (pay%payda!=0) {
			
			kalan=pay%payda;
			
			pay=payda;
			payda=kalan;	
				
		}
		
		System.out.println("\n"+sayi1+" ve "+sayi2+" sayılarının EBOB değeri : "+payda);
		System.out.println("\n"+sayi1+" ve "+sayi2+" sayılarının EKOK değeri : "+((sayi1*sayi2)/payda));

}
}
