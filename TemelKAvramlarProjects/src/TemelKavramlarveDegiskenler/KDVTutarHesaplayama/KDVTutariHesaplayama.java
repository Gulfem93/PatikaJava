package TemelKavramlarveDegiskenler.KDVTutarHesaplayama;

import java.util.Scanner;

public class KDVTutariHesaplayama {
    public static void main(String[] args) {
        /**
         * KDV Tutarı Hesaplayan Program
         * Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

         (Not : KDV tutarını 18% olarak alın)
         KDV'siz Fiyat = 10;
         KDV'li Fiyat = 11.8;
         KDV tutarı = 1.8;

         * Ödev
         * Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.*/

        int KDVsizFiyat;
        float KDV, KDVliFiyat;

        Scanner inputFiyat = new Scanner(System.in);
        System.out.print("Fiyat: ");
        KDVsizFiyat = inputFiyat.nextInt();

        if (KDVsizFiyat < 1000)
        {
            KDV = KDVsizFiyat * (18f / 100);
            KDVliFiyat = KDVsizFiyat + KDV;
            System.out.printf("%.1f", KDVliFiyat);
        }
        else
        {
            KDV = KDVsizFiyat * (8f / 100);
            KDVliFiyat = KDVsizFiyat + KDV;
            System.out.printf("%.1f", KDVliFiyat);
        }
    }
}
