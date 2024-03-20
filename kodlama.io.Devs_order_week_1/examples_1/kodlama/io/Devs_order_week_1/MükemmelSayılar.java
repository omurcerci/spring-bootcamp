package kodlama.io.Devs_order_week_1;
public class MükemmelSayılar {

    public static void main(String[] args) {
        int sayi1 = 220, sayi2 = 284, toplam1 = 0, toplam2 = 0;

        // İlk sayının bölenlerini topla
        for (int i = 1; i < sayi1; i++) {
            if (sayi1 % i == 0) {
                toplam1 += i;
            }
        }

        // İkinci sayının bölenlerini topla
        for (int i = 1; i < sayi2; i++) {
            if (sayi2 % i == 0) {
                toplam2 += i;
            }
        }

        // İki sayının mükemmel sayı olup olmadığını kontrol et
        if (sayi1 == toplam2 && sayi2 == toplam1) {
            System.out.println(sayi1 + " ve " + sayi2 + " mükemmel sayılardır.");
        } else {
            System.out.println(sayi1 + " ve " + sayi2 + " mükemmel sayılar değildir.");
        }
    }
}
