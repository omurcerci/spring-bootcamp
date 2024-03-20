package kodlama.io.Devs_order_week_1;
import java.util.Scanner;
public class perfect_number {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	

	System.out.println("Lütfen bir sayi giriniz : ");
	int perfect_number = scanner.nextInt();
	
	int toplam = 0;
	for(int i = 1; i < perfect_number ; i++) {		
		
		if(perfect_number %  i == 0) {
			toplam += i;
		}
	
	}
		
			
	if(perfect_number == toplam) {
		System.out.println("Bu sayı mükemmel bir sayıdır..");
	}
	else {
		System.out.println("Bu sayı mükemmel değildir.");
		
		}

	}
}

