package kucukEnYakinSayiyiVeEnBuyukEnYakinSayiyiBulma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        kucukBuyukYakinSayilar kb1 = new kucukBuyukYakinSayilar();

        int n, sayi;
        Scanner ninput = new Scanner(System.in);
        System.out.print("N:");
        n = ninput.nextInt();
        kb1.setN(n);

        Scanner sayiinput = new Scanner(System.in);
        System.out.print("sayi:");
        sayi = sayiinput.nextInt();
        kb1.setSayi(sayi);


        kb1.hesapla();
    }
}
