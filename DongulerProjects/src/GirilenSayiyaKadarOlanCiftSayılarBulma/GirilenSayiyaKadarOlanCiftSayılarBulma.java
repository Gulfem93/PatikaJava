package GirilenSayiyaKadarOlanCiftSayılarBulma;

import java.util.Scanner;

public class GirilenSayiyaKadarOlanCiftSayılarBulma {
    public static void main(String[] args) {
        /**
         * Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.

         * Ödev
         Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.*/

        int number, toplamnumber = 0, n = 0;
        Scanner numberinput = new Scanner(System.in);
        System.out.printf("Bir sayi giriniz: ");
        number = numberinput.nextInt();
        int ortalama;

        for(int i = 0; i < number; i++)
        {
            if(i % 3 == 0 && i % 4 == 0)
            {
                n = n + 1;
                toplamnumber = i + toplamnumber;
            }
        }
        ortalama = toplamnumber / n;
        System.out.printf("Ortalama : %d", ortalama);

    }
}
