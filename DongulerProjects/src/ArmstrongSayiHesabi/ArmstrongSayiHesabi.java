package ArmstrongSayiHesabi;

import java.util.Scanner;

public class ArmstrongSayiHesabi {
    public static void main(String[] args) {
        /**
         *  1634 = 1^4 + 6^4 + 3^4 + 4^4
         *       = 1 + 1296 + 81 + 256
         *       = 1634
         */

        int number, x, karsilastirma;
        double sonuc = 0;

        Scanner numberinput = new Scanner(System.in);
        System.out.printf("Sayi: ");
        number = numberinput.nextInt();

        int length = (String.valueOf(number)).length();
        karsilastirma = number;
        while(number != 0)
        {
            x = number % 10;
            number = (number - x) / 10;
            sonuc = sonuc + Math.pow(x, length);
        }

        if (karsilastirma == (int)sonuc)
            System.out.printf(karsilastirma + " sayisi bir Armstrong Sayır. ");
        else
            System.out.printf(karsilastirma + " sayisi bir Armstrong Sayı değildir. ");
    }
}
