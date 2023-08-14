package HarmonikSeri;

import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        int number;
        float harmonikSeri = 0f;

        Scanner numberinput = new Scanner(System.in);
        System.out.print("Sayi: ");
        number = numberinput.nextInt();

        for(int i = 1; i < number; i++)
        {
            harmonikSeri = harmonikSeri +  (1 / (float)i);
        }
        System.out.printf("Harmonik Serisi: %.2f", harmonikSeri);
    }
}
