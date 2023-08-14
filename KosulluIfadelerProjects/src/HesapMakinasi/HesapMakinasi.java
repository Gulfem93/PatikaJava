package HesapMakinasi;

import java.util.Scanner;

public class HesapMakinasi {
    public static void main(String[] args) {
        /** top: toplama,
         *  cik: cikarma
         *  car: carpma
         *  bol: bolme
         */

        int sayi1, sayi2, num;
        int top, cik, car, bol;

        Scanner sayi1input = new Scanner(System.in);
        Scanner sayi2input = new Scanner(System.in);

        System.out.printf("Birinci Sayi:");
        sayi1 = sayi1input.nextInt();
        System.out.printf("İkinci Sayi:");
        sayi2 = sayi2input.nextInt();

        System.out.println("toplama için 1 ");
        System.out.println("cikarma için 2 ");
        System.out.println("carpma için 3 ");
        System.out.println("bolme için 4 ");

        Scanner numinput = new Scanner(System.in);
        System.out.printf("1-4 arasında bir sayi giriniz:");
        num = numinput.nextInt();

        switch (num)
        {
            case 1:
                top = sayi1 + sayi2;
                System.out.printf("%d + %d = %d", sayi1, sayi2, top);
                break;
            case 2:
                cik = sayi1 - sayi2;
                System.out.printf("%d - %d = %d", sayi1, sayi2, cik);
                break;
            case 3:
                car = sayi1 * sayi2;
                System.out.printf("%d * %d = %d", sayi1, sayi2, car);
                break;
            case 4:
                bol = sayi1 / sayi2;
                System.out.printf("%d / %d = %d", sayi1, sayi2, bol);
                break;
        }
    }
}
