package BoksOyunu;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static char rndmLR()
    {
        char rLR = 'a';

        Random rand = new Random();
        int rakipud = rand.nextInt(2);
        int rakiplr = rand.nextInt(2);

        if (rakiplr == 1)
            rLR = 'l';
        else if(rakiplr == 0)
            rLR = 'r';

        return rLR;
    }

    public static char rndmUD()
    {
        char rUD = 'a';

        Random rand = new Random();
        int rakipud = rand.nextInt(2);

        if (rakipud == 1)
            rUD = 'u';
        else if(rakipud == 0)
            rUD = 'd';

        return rUD;
    }

    public static void main(String[] args) {
        // Kisi yumruk yönü (Yukarı Aşağı için (u(yukarı) - d(aşağı))) (Sag sol icin (l(sol) - r(sağ)))
        // Rakip yumruk yönü (Yukarı Aşağı için (u(yukarı) - d(aşağı))) (Sag sol icin (l(sol) - r(sağ)))

        // Kişi yumruk yönü girme (ud -> yukarı aşağı, lr -> sağa sola)

        char ud;
        char lr;

        System.out.println("Sıra sende: ");
        Scanner udinput = new Scanner(System.in);
        System.out.printf("Yukarı icin (u) - Aşağı için (d) giriniz: ");
        ud = udinput.next().charAt(0);

        Scanner lrinput = new Scanner(System.in);
        System.out.printf("Sol icin (l) - Sağ için (r) giriniz: ");
        lr = lrinput.next().charAt(0);
        

        char rDU = rndmUD();
        char rRL = rndmLR();

        Kisi kisi = new Kisi(ud, lr, 25);
        Rakip rakip = new Rakip(rDU, rRL, 25);

        if(lr == rRL && ud == rDU) {
            System.out.println("------------");
            System.out.println("Rakibinin hamlesi: " + rDU + " " + rRL);
            System.out.println("Senin hamlen: " + ud + " " + lr);

            kisi.KisiFight();
        }
        else
        {
            System.out.println("------------");
            System.out.println("Rakibinin hamlesi: " + rDU + " " + rRL);
            System.out.println("Senin hamlen: " + ud + " " + lr);
        }
        System.out.println("kisi healty: " + kisi.kisiHealty);


        char rDU1 = rndmUD();
        char rRL1 = rndmLR();

        Kisi kisi1 = new Kisi(ud, lr, 25);
        Rakip rakip1 = new Rakip(rDU1, rRL1, 25);

        if(lr == rRL1 && ud == rDU1) {
            System.out.println("------------");
            System.out.println("Senin hamlen: " + ud + " " + lr);
            System.out.println("Rakibinin hamlesi: " + rDU1 + " " + rRL1);

            rakip1.RakipFight();
        }
        else
        {
            System.out.println("------------");
            System.out.println("Senin hamlen: " + ud + " " + lr);
            System.out.println("Rakibinin hamlesi: " + rDU1 + " " + rRL1);
        }
        System.out.println("rakip healty: " + rakip1.rakipHealty);


    }
}
