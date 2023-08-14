package ArtikYilHesabi;

import java.util.Scanner;

public class ArtikYilHesabi {
    public static void main(String[] args) {
        int yil;
        Scanner yilinput = new Scanner(System.in);
        System.out.printf("Yıl Giriniz : ");
        yil = yilinput.nextInt();

        if(yil % 400 == 0)
        {
            System.out.printf("%d bir artık yıldır !", yil);
        } else if (yil % 100 == 0) {
            System.out.printf("%d bir artık yıldır değildir !", yil);
        } else{
            if(yil % 4 == 0)
                System.out.printf("%d bir artık yıldır !");
            else
                System.out.printf("%d bir artık yıldır değildir !", yil);
        }

    }
}
