package TemelKavramlarveDegiskenler.ManavKasaProgrami;

import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        /**
         * Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
         *
         * Meyveler ve KG Fiyatları
         *
         * Armut : 2,14 TL
         * Elma : 3,67 TL
         * Domates : 1,11 TL
         * Muz: 0,95 TL
         * Patlıcan : 5,00 TL
         * Örnek Çıktı;*/

        int armut, elma, domates, muz, patlican;

        Scanner elmainput = new Scanner(System.in);
        Scanner armutinput = new Scanner(System.in);
        Scanner domatesinput = new Scanner(System.in);
        Scanner muzinput = new Scanner(System.in);
        Scanner patlicaninput = new Scanner(System.in);


        System.out.printf("Elma kilosu: ");
        elma = elmainput.nextInt();

        System.out.printf("Armut kilosu: ");
        armut = armutinput.nextInt();

        System.out.printf("Domates kilosu: ");
        domates = domatesinput.nextInt();

        System.out.printf("Muz kilosu: ");
        muz = muzinput.nextInt();

        System.out.printf("Patlican kilosu: ");
        patlican = patlicaninput.nextInt();

        double toplam = (patlican * 5.00) + (muz * 0.95) + (domates * 1.11) + (elma * 3.67) + (armut * 2.14);
        System.out.printf("Toplam Tutar: " + toplam);


    }
}
