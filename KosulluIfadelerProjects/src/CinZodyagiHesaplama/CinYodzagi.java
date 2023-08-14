package CinZodyagiHesaplama;

import java.util.Scanner;

public class CinYodzagi {
    public static void main(String[] args) {
        /**
         * Doğum Tarihi %12 = 0 ➜ Maymun
         * Doğum Tarihi %12 = 1 ➜ Horoz
         * Doğum Tarihi %12 = 2 ➜ Köpek
         * Doğum Tarihi %12 = 3 ➜ Domuz
         * Doğum Tarihi %12 = 4 ➜ Fare
         * Doğum Tarihi %12 = 5 ➜ Öküz
         * Doğum Tarihi %12 = 6 ➜ Kaplan
         * Doğum Tarihi %12 = 7 ➜ Tavşan
         * Doğum Tarihi %12 = 8 ➜ Ejderha
         * Doğum Tarihi %12 = 9 ➜ Yılan
         * Doğum Tarihi %12 = 10 ➜ At
         * Doğum Tarihi %12 = 11 ➜ Koyun
         */

        int dogumTarihi;
        Scanner dtinput = new Scanner(System.in);
        System.out.printf("Doğum Yılınızı Giriniz : ");
        dogumTarihi = dtinput.nextInt();

        if (dogumTarihi % 12 == 0)
            System.out.printf("Çin Zodyağı Burcunuz : Maymun");
        else if (dogumTarihi % 12 == 1)
            System.out.printf("Çin Zodyağı Burcunuz : Horoz");
        else if (dogumTarihi % 12 == 2)
            System.out.printf("Çin Zodyağı Burcunuz : Köpek");
        else if (dogumTarihi % 12 == 3)
            System.out.printf("Çin Zodyağı Burcunuz : Domuz");
        else if (dogumTarihi % 12 == 4)
            System.out.printf("Çin Zodyağı Burcunuz : Fare");
        else if (dogumTarihi % 12 == 5)
            System.out.printf("Çin Zodyağı Burcunuz : Öküz");
        else if (dogumTarihi % 12 == 6)
            System.out.printf("Çin Zodyağı Burcunuz : Kaplan");
        else if (dogumTarihi % 12 == 7)
            System.out.printf("Çin Zodyağı Burcunuz : Tavşan");
        else if (dogumTarihi % 12 == 8)
            System.out.printf("Çin Zodyağı Burcunuz : Ejderha");
        else if (dogumTarihi % 12 == 9)
            System.out.printf("Çin Zodyağı Burcunuz : Yılan");
        else if (dogumTarihi % 12 == 10)
            System.out.printf("Çin Zodyağı Burcunuz : At");
        else if (dogumTarihi % 12 == 11)
            System.out.printf("Çin Zodyağı Burcunuz : Koyun");
    }
}
