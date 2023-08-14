package TekSayilarinToplami;

import java.util.Scanner;

public class TekSayilarinToplami {
    public static void main(String[] args) {
        /**
         * Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.
         *
         * Ödev
         * Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
         * girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.*/

        int number, toplamnumber = 0, n = 0, ortalama;
        Scanner numberinput = new Scanner(System.in);
        System.out.printf("Bir sayi giriniz: ");
        number = numberinput.nextInt();


        for(int i = 0; i < number; i++)
        {
            if(i % 4 == 0)
            {
                n = n + 1;
                toplamnumber = i + toplamnumber;
            }
        }
        ortalama = toplamnumber / n;
        System.out.printf("Ortalama : %d", ortalama);
    }
}
