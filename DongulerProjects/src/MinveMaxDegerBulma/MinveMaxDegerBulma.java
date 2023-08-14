package MinveMaxDegerBulma;

import java.util.Scanner;

public class MinveMaxDegerBulma {
    public static void main(String[] args) {
        // Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.

        int n;
        Scanner ninput = new Scanner(System.in);
        System.out.printf("N: ");
        n = ninput.nextInt();

        int number, numberO, numberS;

        int oncekiSayi, sonrakiSayi;
        int maxSayi = 0, minSayi = 0;
        int oncekiS, sonrakiS, mSayi;

        Scanner numberOinput = new Scanner(System.in);
        System.out.printf("1. Sayıyı giriniz: ");
        numberO = numberOinput.nextInt();

        Scanner numberSinput = new Scanner(System.in);
        System.out.printf("2. Sayıyı giriniz: ");
        numberS = numberSinput.nextInt();

        oncekiS = numberO;
        sonrakiS = numberS;

        if(oncekiS < sonrakiS)
        {
            minSayi = oncekiS;
            maxSayi = sonrakiS;
        }else if(oncekiS > sonrakiS)
        {
            minSayi = sonrakiS;
            maxSayi = oncekiS;
        }

        for(int i = 1; i < n-1; i++)
        {
            Scanner numberinput1 = new Scanner(System.in);
            System.out.printf((i+2) + ". Sayıyı giriniz: ");
            number = numberinput1.nextInt();

            sonrakiSayi = number;
            oncekiSayi = oncekiS;

            if (oncekiSayi > maxSayi)
            {
                maxSayi = oncekiSayi;
            } else if (sonrakiSayi > maxSayi) {
                maxSayi = sonrakiSayi;
            }
            else if(oncekiS < minSayi)
            {
                minSayi = oncekiSayi;
            }else if(sonrakiSayi < minSayi)
            {
                minSayi = sonrakiSayi;
            }

            oncekiS = oncekiSayi;
        }
        System.out.println("En küçük sayı: " + minSayi);
        System.out.println("En büyük sayı: " + maxSayi);
    }
}
