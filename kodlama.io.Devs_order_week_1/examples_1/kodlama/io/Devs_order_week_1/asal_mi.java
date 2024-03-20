package kodlama.io.Devs_order_week_1;

import java.util.Scanner;
public class asal_mi {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Lütfen bir sayi giriniz : ");
		int asal_mi = scanner.nextInt();
		scanner.nextLine();
		
		/*
		Kendinden ve 1 den başka hiçbir sayıya bölünmeyen sayılar 
		*/
		
		if(asal_mi < 2)
		{
			System.out.println("Asal değil");
			return;
		}
		
		boolean asalMi=true;
		for(int i=2; i <= Math.sqrt(asal_mi); i++)
		{
			if(asal_mi % i == 0)
				asalMi = false;
				break;
		}
		
		if(asalMi) {
			System.out.println("Asal");
		}
		else {
			System.out.println("Asal Değil");
		}
		

	}

}
