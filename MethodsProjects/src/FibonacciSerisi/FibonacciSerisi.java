package FibonacciSerisi;

import java.util.Scanner;

public class FibonacciSerisi {
    static int fibonacci(int sayi)
    {
        if (sayi == 1 || sayi == 2)
            return 1;
        return  fibonacci(sayi - 1) + fibonacci(sayi - 2);
    }
    public static void main(String[] args) {
        int sayi;
        Scanner sayiinput = new Scanner(System.in);
        System.out.printf("N: ");

        sayi = sayiinput.nextInt();
        System.out.printf("Fibonacci: ");
        for(int i = 1; i < sayi; i++)
        {
            System.out.printf(" " + fibonacci(i));
        }

    }
}
