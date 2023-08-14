package SinifiGecmeDurumu;

import java.util.Scanner;

public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        /**
         Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
         Geçme Notu : 55
         * Ödev
         Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
         */

        int matematik, fizik, turkce, kimya, muzik, ortalama;

        Scanner matematikinput = new Scanner(System.in);
        Scanner fizikinput = new Scanner(System.in);
        Scanner turkceinput = new Scanner(System.in);
        Scanner kimyainput = new Scanner(System.in);
        Scanner muzikinput = new Scanner(System.in);

        System.out.printf("Matematik Notu: ");
        matematik = matematikinput.nextInt();

        System.out.printf("Fizik Notu: ");
        fizik = fizikinput.nextInt();

        System.out.printf("Turkce Notu: ");
        turkce = turkceinput.nextInt();

        System.out.printf("Kimya Notu: ");
        kimya = kimyainput.nextInt();

        System.out.printf("Muzik Notu: ");
        muzik = muzikinput.nextInt();

        // ortalama = matematik + fizik + turkce + kimya + muzik;

        ortalama = 0;
        int num = 0;
        if(matematik > 0 && matematik < 100)
        {
            ortalama = matematik + ortalama;
            num = num + 1;
        }
        if(fizik > 0 && fizik < 100)
        {
            ortalama = fizik + ortalama;
            num = num + 1;
        }
        if(turkce > 0 && turkce < 100)
        {
            ortalama = turkce + ortalama;
            num = num + 1;
        }
        if(kimya > 0 && kimya < 100)
        {
            ortalama = kimya + ortalama;
            num = num + 1;
        }
        if(muzik > 0 && muzik < 100)
        {
            ortalama = muzik + ortalama;
            num = num + 1;
        }

        ortalama = ortalama / num;
        System.out.printf("Ortalama: %d", ortalama);


    }
}
