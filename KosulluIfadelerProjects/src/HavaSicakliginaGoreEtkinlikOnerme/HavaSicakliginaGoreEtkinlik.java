package HavaSicakliginaGoreEtkinlikOnerme;

import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlik {
    public static void main(String[] args) {
        /**
         * Koşullar :

         * Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
         * Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
         * Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
         * Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

         * Ödev
         Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.
         */

        int sicaklik;
        Scanner sicaklikinput = new Scanner(System.in);
        System.out.printf("Hava sicakligi: ");
        sicaklik = sicaklikinput.nextInt();

        if (sicaklik < 5)
            System.out.printf("Kayak yapilmali");
        else if (5 <= sicaklik || sicaklik >= 15)
            System.out.printf("Sinema yapilmali");
        else if (15 <= sicaklik || sicaklik >= 25)
            System.out.printf("Piknik yapilmali");
        else if (sicaklik >= 25)
            System.out.printf("Yüzme yapilmali");
    }
}
