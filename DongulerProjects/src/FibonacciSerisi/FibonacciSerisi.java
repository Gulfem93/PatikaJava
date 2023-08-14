package FibonacciSerisi;

import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        // 9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34
        int number;
        Scanner numberinput = new Scanner(System.in);
        System.out.printf("Sayi: ");
        number = numberinput.nextInt();

        int oncekiSayi = 0, sonrakiSayi = 1, toplam;

        System.out.printf(oncekiSayi  + " " + sonrakiSayi + " ");
        for(int i = 1; i < number; i++)
        {
            toplam = sonrakiSayi + oncekiSayi;
            System.out.print(toplam + " ");
            oncekiSayi = sonrakiSayi;
            sonrakiSayi = toplam;
        }
    }
}
