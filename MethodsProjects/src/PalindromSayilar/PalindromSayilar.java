package PalindromSayilar;

import java.util.Scanner;

public class PalindromSayilar {
    /**
     * Palindrom Sayı Nedir ?
     * Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.
     *
     * Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
     */

    public static int sayininTersi(int sayi)
    {
        int sTersi = 0, basamak;
        int length = (String.valueOf(sayi)).length();

        for(int i = 0; i < length; i++)
        {
            basamak = sayi % 10;
            sayi = sayi / 10;
            sTersi = sTersi + (basamak * (int)Math.pow(10, length - 1 - i));
        }
        return  sTersi;
    }
    public static void main(String[] args) {
        int sayi;
        int sTersi;

        Scanner sayiinput = new Scanner(System.in);
        System.out.printf("Lutfen bir sayi giriniz: ");
        sayi = sayiinput.nextInt();
        sTersi = sayininTersi(sayi);
        if (sayi == sTersi)
            System.out.printf("Palindrom Sayidir. ");
        else if (sayi != sTersi)
            System.out.printf("Palindrom Sayi değildir. ");

    }

}
