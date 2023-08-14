package EBOBveEKOK;

import java.util.Scanner;

public class EKOK {
    public static void main(String[] args) {
        int sayi1, sayi2;

        Scanner sayi1input = new Scanner(System.in);
        System.out.printf("Birinci sayiyi giriniz: ");
        sayi1 = sayi1input.nextInt();

        Scanner sayi2input = new Scanner(System.in);
        System.out.printf("Birinci sayiyi giriniz: ");
        sayi2 = sayi2input.nextInt();

        int ebob = 1, ekok;

        if(sayi1 < sayi2)
        {
            for(int i = 1; i < sayi1; i++)
            {
                if(sayi1 % i == 0 && sayi2 % i== 0)
                {
                    ebob = i;
                }
            }
        }
        else
        {
            for(int i = 1; i < sayi2; i++)
            {
                if(sayi1 % i == 0 && sayi2 % i== 0)
                {
                    ebob = i;
                }
            }
        }
        ekok = (sayi1 * sayi2) / ebob;
        System.out.println("ebob: " + ebob);
        System.out.println("ekok: " + ekok);
    }
}
