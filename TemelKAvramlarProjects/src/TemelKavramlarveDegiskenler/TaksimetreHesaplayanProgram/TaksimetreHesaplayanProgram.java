package TemelKavramlarveDegiskenler.TaksimetreHesaplayanProgram;

import java.util.Scanner;

public class TaksimetreHesaplayanProgram {
    public static void main(String[] args) {
        /**
         * Taksimetre Programı
         * Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
         *
         * Taksimetre KM başına 2.20 TL tutmaktadır.
         * Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
         * Taksimetre açılış ücreti 10 TL'dir.*/

        float ucret, km;

        Scanner ucretinput = new Scanner(System.in);
        System.out.print("KM: ");
        km = ucretinput.nextInt();

        ucret = 10f + (km * 22f/10);
        if (ucret < 20)
            System.out.println("ucret: " + 20);
        else
            System.out.println("ucret: " + ucret);
    }
}
