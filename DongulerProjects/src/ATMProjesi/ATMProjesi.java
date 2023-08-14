package ATMProjesi;

import java.util.Scanner;

public class ATMProjesi {
    public static void main(String[] args) {
        /**
         * pwd: Şifre girişi
         * şifre kontrolü
         * şifre doğru ise devam aksi tadirde hata
         * -> Kontrol sonucunda şifre doğru ise
         * 1. Para çekme işlemi (Belli miktar para buluncak)
         *    -> Eğer çekeceği miktar, kişinin sahip olduğu miktardan az ise kişi parayı çekebilsin
         *    -> Aksi takdirde "Bakiye Yetersiz!" hatası alsın.
         * 2. ATM ye hesaba para yatırma
         */

        int kayitliSifre = 1828, pwd;
        int bakiyedekiPara = 5000, cekecegimPara, yatirilcakPara;

        Scanner pwdinput = new Scanner(System.in);
        System.out.printf("Lütfen sifreyi giriniz: ");
        pwd = pwdinput.nextInt();
        int i = 3;

        try
        {
            if(kayitliSifre == pwd) {
                int islem;
                System.out.println("Para cekmek için 1\n " +
                        "Para yatırmak için 2 giriniz.\n" +
                        "İşlemden cikmak icin 3 giriniz");

                do
                {
                    Scanner isleminput = new Scanner(System.in);
                    System.out.printf("Yapacagınız islem: ");
                    islem = isleminput.nextInt();

                    switch (islem)
                    {
                        case 1: {
                            Scanner cekecegimParainput = new Scanner(System.in);
                            System.out.printf("Çekilecek miktar: ");
                            cekecegimPara = cekecegimParainput.nextInt();

                            if (cekecegimPara < bakiyedekiPara) {
                                System.out.println(cekecegimPara + " miktarda para çekilmiştir. ");
                            }
                            bakiyedekiPara = bakiyedekiPara - cekecegimPara;
                            break;
                        }
                        case 2: {
                            Scanner yatirilcekParainput = new Scanner(System.in);
                            System.out.printf("Yatırılacak miktar: ");
                            yatirilcakPara = yatirilcekParainput.nextInt();

                            bakiyedekiPara = bakiyedekiPara + yatirilcakPara;
                            System.out.println(yatirilcakPara + " miktarda para yatirilmiştır. ");
                            break;
                        }
                    }
                }
                while (islem != 3);
            }
            else
            {
                System.out.printf("Hatalı şifre. Tekrar deneyiniz.");
            }

        }
        catch (Exception e)
        {
            System.out.printf("Exception: " + e);
        }
    }
}
