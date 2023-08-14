package SayilariSiralama;

import java.util.Scanner;

public class SayilariSirama {
    public static void main(String[] args) {
        int sayi1, sayi2, sayi3;

        Scanner sayi1input = new Scanner(System.in);
        System.out.printf("Birinci sayi: ");
        sayi1 = sayi1input.nextInt();

        Scanner sayi2input = new Scanner(System.in);
        System.out.printf("İkinci sayi: ");
        sayi2 = sayi2input.nextInt();

        Scanner sayi3input = new Scanner(System.in);
        System.out.printf("Üçüncü sayi: ");
        sayi3 = sayi3input.nextInt();

        if (sayi1 < sayi2 && sayi1 < sayi3)
        {
            if (sayi2 < sayi3)
                System.out.printf("%d < %d < %d", sayi1, sayi2, sayi3);
                //siralama = sayi1 + "<" + sayi2 + "<" + sayi3;

            else
                System.out.printf("%d < %d < %d", sayi1, sayi3, sayi2);
                // siralama = sayi1 + "<" + sayi3 + "<" + sayi2;
        }
        else if (sayi2 < sayi3 && sayi2 < sayi1)
        {
            if (sayi1 < sayi3)
                System.out.printf("%d < %d < %d", sayi2, sayi1, sayi3);
                // siralama = sayi2 + "<" + sayi1 + "<" + sayi3;

            else
                System.out.printf("%d < %d < %d", sayi2 , sayi3, sayi1);
                // siralama = sayi2 + "<" + sayi3 + "<" + sayi1;
        }
        else if (sayi3 < sayi2 && sayi3 < sayi1)
        {
            if (sayi1 < sayi2)
                System.out.printf("%d < %d < %d", sayi3, sayi1, sayi2);
                // siralama = sayi3 + "<" + sayi1 + "<" + sayi2;

            else
                System.out.printf("%d < %d < %d", sayi3, sayi2, sayi1);
                // siralama = sayi3 + "<" + sayi2 + "<" + sayi1;
        }
    }
}
