package TekrarEdenSayilariBulma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        tekrarEdenSayi t = new tekrarEdenSayi();

        int n;
        Scanner ninput = new Scanner(System.in);
        System.out.print("N: ");
        n = ninput.nextInt();

        t.setN(n);
        t.hesap();

    }
}
