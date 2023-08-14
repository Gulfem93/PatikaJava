package DortveBesinKuvvetleriYazdirma;

import java.util.Scanner;

public class DortveBesinKuvvetleriYazdirma {
    public static void main(String[] args) {
        // Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

        int girilenSayi;
        Scanner girilenSayiInput = new Scanner(System.in);
        System.out.printf("Girilen Sayi: ");
        girilenSayi = girilenSayiInput.nextInt();

        int i = 1;
        double dorduncuKuvveti, besinciKuvveti;
        while (true)
        {
            dorduncuKuvveti = Math.pow(i, 4);
            besinciKuvveti = Math.pow(i, 5);
            if(dorduncuKuvveti < girilenSayi || besinciKuvveti < girilenSayi)
            {
                System.out.println(i + "^" + "4" + " = : " + dorduncuKuvveti);
                System.out.println(i + "^" + "5" + " = : " + besinciKuvveti);
            }
            i = i + 1;
        }
    }
}
