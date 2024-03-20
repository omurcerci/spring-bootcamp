package kodlama.io.Devs_order_week_1;

import java.util.Scanner;
import java.util.Scanner;
public class sesliHarfler {

	public static void main(String[] args) {
		System.out.println("Bir harf giriniz : ");
		Scanner scanner = new Scanner(System.in);
		char harf = scanner.next().charAt(0); // Kullanıcının girdiği string'den sadece ilk karakteri alıyoruz.
		
		
		switch (harf) {
        case 'A':
        case 'I':
        case 'O':
        case 'U':
            System.out.println(harf + " Kalın sesli harf.");
            break;
        case 'E':
        case 'İ':
        case 'Ö':
        case 'Ü':
            System.out.println(harf + " İnce sesli harf.");
            break;
        default:
            System.out.println("Girilen karakter sesli harf değil.");
		}
		
	}
}		




