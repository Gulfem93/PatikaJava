package DeseneGoreMetotOlusturma;

import java.util.Scanner;

public class DeseneGoreMetotOlusturma {
    static int sayidanSifira(int sayi)
    {
        if (sayi <= 0)
            return 0;
        System.out.printf(" " + sayi);
        return sayidanSifira(sayi - 5);
    }
    static void sifirdanSayiya(int sayi)
    {
        for(int i = 0; i <= sayi; i = i + 5)
        {
            if(i > 0)
                System.out.printf(" " + i);
        }
    }
    public static void main(String[] args) {
        int sayi;
        Scanner sayiinput = new Scanner(System.in);
        System.out.printf("Sayi: ");
        sayi = sayiinput.nextInt();

        System.out.printf(" " + sayidanSifira(sayi) + " ");
        sifirdanSayiya(sayi);


    }
}
