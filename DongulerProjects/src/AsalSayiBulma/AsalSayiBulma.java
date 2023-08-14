package AsalSayiBulma;

import java.util.Scanner;

public class AsalSayiBulma {
    public static void main(String[] args) {
        // Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.
        int sayi;
        Scanner sayiinput = new Scanner(System.in);
        System.out.printf("Kadar sayi: ");
        sayi = sayiinput.nextInt();

        int sayac = 0;
        for(int i = 2; i < sayi; i++)
        {
            int kontrol = 0;
            for(int j = 2; j < i; j++)
            {

                if(i % j == 0) {
                    kontrol = kontrol + 1;
                    break;
                }

            }
            if(kontrol == 0)
            {
                System.out.print(i + " ");
                sayac++;
            }
        }
    }
}
