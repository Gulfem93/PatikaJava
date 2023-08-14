package UcakBiletiSorgulama;
import java.util.Scanner;

public class UcakBiletiSorgulama {
    public static void main(String[] args) {
        try {
            int km, yasi, yolculuktipi;
            double ucret = 0, yasIndirimi, yolcuTipiTndirimi, indirimUcreti = 0;

            Scanner kminput = new Scanner(System.in);
            System.out.printf("Mesafeyi km türünden giriniz :");
            km = kminput.nextInt();

            Scanner yasiinput = new Scanner(System.in);
            System.out.printf("Yaşınızı giriniz : ");
            yasi = yasiinput.nextInt();

            Scanner ytinput = new Scanner(System.in);
            System.out.printf("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
            yolculuktipi = ytinput.nextInt();

            if(km > 0)
            {
                ucret = 0.1 * km;

                if(yasi > 0)
                {
                    if (yasi < 12) {
                        // Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
                        yasIndirimi = (ucret * 50) / 100;
                        indirimUcreti = ucret - yasIndirimi;
                    } else if (12 < yasi || yasi < 24) {
                        // Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
                        yasIndirimi = (ucret * 10) / 100;
                        indirimUcreti = ucret - yasIndirimi;
                    } else if (yasi > 64) {
                        // Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
                        yasIndirimi = (ucret * 30) / 100;
                        indirimUcreti = ucret - yasIndirimi;
                    }
                    if (yolculuktipi < 3) {
                        switch (yolculuktipi) {
                            case 1:
                                // Tek gidiş
                                System.out.printf("Toplam Tutar = " + ucret + " TL");
                                break;
                            case 2:
                                // gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır
                                yolcuTipiTndirimi = (indirimUcreti * 20) / 100;
                                ucret = indirimUcreti - yolcuTipiTndirimi;
                                System.out.printf("Toplam Tutar = " + ucret * 2 + " TL");
                        }

                    }
                    else if(yolculuktipi >= 3)
                        System.out.println("Hatalı Veri Girdiniz !");
                }
                else
                    System.out.println("Hatalı Veri Girdiniz !");
            }
            else
                System.out.println("Hatalı Veri Girdiniz !");
        } catch (Exception e) {
            System.out.println("Hatalı Veri Girdiniz !");
        }
    }
}