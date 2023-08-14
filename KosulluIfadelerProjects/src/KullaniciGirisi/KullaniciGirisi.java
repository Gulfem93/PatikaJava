package KullaniciGirisi;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        /**
         * Ödev
         * Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
         * eğer kullanıcı sıfırlamak isterse
         * yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip,
         * şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.*/


        int password, hataliSifre;
        password = 1828;

        Scanner passinput = new Scanner(System.in);
        System.out.printf("Passaword: ");
        hataliSifre = passinput.nextInt();

        if (hataliSifre != password)
        {
            System.out.println("Sifreyi sifirlamak istiyorsaniz 0 giriniz\nSifreyi sifirlamak istemiyorsaniz 1 giriniz");
            int sifreSifirlama;
            Scanner sifreSifirlamainput = new Scanner(System.in);
            System.out.printf("New Passaword: ");
            sifreSifirlama = sifreSifirlamainput.nextInt();

            switch (sifreSifirlama)
            {
                case 0:
                    int yeniSifre;
                    Scanner yeniSifreinput = new Scanner(System.in);
                    yeniSifre = yeniSifreinput.nextInt();

                    if(yeniSifre != hataliSifre && yeniSifre != password)
                        System.out.printf("Sifre Olusturuldu");
                    else if(yeniSifre == hataliSifre && yeniSifre == password)
                        System.out.printf("Sifre Olusturuldu");
                    break;
                case 1:
                    System.out.printf("Sifre olusturmak istemiyorum");
                    break;
            }
        }


    }
}
