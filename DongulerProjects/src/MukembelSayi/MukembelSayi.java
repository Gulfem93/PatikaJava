package MukembelSayi;

import java.util.Scanner;

public class MukembelSayi {
    public static void main(String[] args) {
        /**
         * Mükemmel Sayı Nedir ?
         * Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.*/

        int sayi, mSayi = 0;
        Scanner sayiinput = new Scanner(System.in);
        System.out.printf("Bir sayı giriniz: ");
        sayi = sayiinput.nextInt();

        if(sayi == 1)
            System.out.printf(sayi + " Mükemmel sayı değildir.");
        else {
            for (int i = 1; i <= sayi; i++) {
                if (sayi % i == 0) {
                    mSayi = mSayi + i;
                }
            }

            if(mSayi % sayi == 0)
                System.out.printf(sayi + " Mükemmel sayıdır.");
        }



    }
}
