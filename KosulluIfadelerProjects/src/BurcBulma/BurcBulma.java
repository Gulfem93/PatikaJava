package BurcBulma;

import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        int ay, gun;

        Scanner ayinput = new Scanner(System.in);
        System.out.printf("Ocak için 1\n" +
                "Şubat için 2\n" +
                "Mart için 3\n" +
                "Nisan için 4\n" +
                "Mayis için 5\n" +
                "Haziran için 6\n" +
                "Temmuz için 7\n" +
                "Agustos için 8\n" +
                "Eylül için 9\n" +
                "Ekim için 10\n" +
                "Kasım için 11\n" +
                "Aralık için 12 giriniz\n");

        System.out.printf("Lütfen ayınızı giriniz (1-12): ");
        ay = ayinput.nextInt();

        Scanner guninput = new Scanner(System.in);
        System.out.printf("Lütfen doğum günününüzü giriniz: ");
        gun = guninput.nextInt();

        if (ay == 1)
        {
            // Oğlak Burcu : 22 Aralık - 21 Ocak
            // Kova Burcu : 22 Ocak - 19 Şubat

            if(gun > 22)
                System.out.printf("Burcunuz Kova ");
            else if (1 < gun || gun < 22)
                System.out.printf("Burcunuz Oğlak");
        }
        if (ay == 2)
        {
            // Kova Burcu : 22 Ocak - 19 Şubat
            //Balık Burcu : 20 Şubat - 20 Mart
            if(gun > 20)
                System.out.printf("Burcunuz Balık ");
            else if (1 < gun || gun < 20)
                System.out.printf("Burcunuz Kova");
        }
        if (ay == 3)
        {
            // Balık Burcu : 20 Şubat - 20 Mart
            // Koç Burcu : 21 Mart - 20 Nisan
            if(gun > 21)
                System.out.printf("Burcunuz Koç ");
            else if (1 < gun || gun < 21)
                System.out.printf("Burcunuz Balık");
        }
        if (ay == 4)
        {
            // Koç Burcu : 21 Mart - 20 Nisan
            // Boğa Burcu : 21 Nisan - 21 Mayıs
            if(gun > 22)
                System.out.printf("Burcunuz Boğa ");
            else if (1 < gun || gun < 22)
                System.out.printf("Burcunuz Koç");
        }
        if (ay == 5)
        {
            // Boğa Burcu : 21 Nisan - 21 Mayıs
            // İkizler Burcu : 22 Mayıs - 22 Haziran
            if(gun > 22)
                System.out.printf("Burcunuz İkizler");
            else if (1 < gun || gun < 22)
                System.out.printf("Burcunuz Boğa");
        }
        if (ay == 6)
        {
            // İkizler Burcu : 22 Mayıs - 22 Haziran
            // Yengeç Burcu : 23 Haziran - 22 Temmuz
            if(gun > 23)
                System.out.printf("Burcunuz Yengeç");
            else if (1 < gun || gun < 22)
                System.out.printf("Burcunuz İkizler");
        }
        if (ay == 7)
        {
            // Yengeç Burcu : 23 Haziran - 22 Temmuz
            // Aslan Burcu : 23 Temmuz - 22 Ağustos
            if(gun > 23)
                System.out.printf("Burcunuz Aslan");
            else if (1 < gun || gun < 23)
                System.out.printf("Burcunuz Yengeç");
        }
        if (ay == 8)
        {
            // Aslan Burcu : 23 Temmuz - 22 Ağustos
            // Başak Burcu : 23 Ağustos - 22 Eylül
            if(gun > 23)
                System.out.printf("Burcunuz Başak");
            else if (1 < gun || gun < 23)
                System.out.printf("Burcunuz Aslan");
        }
        if (ay == 9)
        {
            // Başak Burcu : 23 Ağustos - 22 Eylül
            // Terazi Burcu : 23 Eylül - 22 Ekim
            if(gun > 22)
                System.out.printf("Burcunuz Terazi");
            else if (1 < gun || gun < 23)
                System.out.printf("Burcunuz Başak");
        }
        if (ay == 10)
        {
            // Terazi Burcu : 23 Eylül - 22 Ekim
            // Akrep Burcu : 23 Ekim - 21 Kasım
            if(gun > 22)
                System.out.printf("Burcunuz Akrep");
            else if (1 < gun || gun < 23)
                System.out.printf("Burcunuz Terazi");
        }
        if (ay == 11)
        {
            // Akrep Burcu : 23 Ekim - 21 Kasım
            // Yay Burcu : 22 Kasım - 21 Aralık
            if(gun > 22)
                System.out.printf("Burcunuz Yay");
            else if (1 < gun || gun < 22)
                System.out.printf("Burcunuz Akrep");
        }
        if (ay == 12)
        {
            // Yay Burcu : 22 Kasım - 21 Aralık
            // Oğlak Burcu : 22 Aralık - 21 Ocak
            if(gun > 21)
                System.out.printf("Burcunuz Oğlak");
            else if (1 < gun || gun < 21)
                System.out.printf("Burcunuz Yay");
        }
    }
}
