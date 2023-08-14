package TemelKavramlarveDegiskenler.NotOrtalamasiHesaplayanProgram;
import java.util.Scanner;
public class NotOrtalamasi {
    public static void main(String[] args) {
        /*
        ## Not Ortalaması Hesaplayan Program
         Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

         ## Ödev
         Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.*/

        int Matematik, Fizik, Kimya, Turkce, Tarih, Muzik;

        Scanner inputMatematik = new Scanner(System.in);
        Scanner inputFizik = new Scanner(System.in);
        Scanner inputKimya = new Scanner(System.in);
        Scanner inputTurkce = new Scanner(System.in);
        Scanner inputTarih = new Scanner(System.in);
        Scanner inputMuzik = new Scanner(System.in);


        System.out.print("Matematik: ");
        Matematik = inputMatematik.nextInt();

        System.out.print("Fizik: ");
        Fizik = inputFizik.nextInt();

        System.out.print("Kimya: ");
        Kimya = inputKimya.nextInt();

        System.out.print("Turkce: ");
        Turkce = inputTurkce.nextInt();

        System.out.print("Tarih: ");
        Tarih = inputTarih.nextInt();

        System.out.print("Muzik: ");
        Muzik = inputTarih.nextInt();

        int toplam = Matematik + Fizik + Kimya + Turkce + Tarih + Muzik;
        float ortalama = toplam / 6;

        String durum = (ortalama>=60)? "Sinifi Gecti" : "Sinifta Kaldi";
        System.out.println(durum);
    }
}
