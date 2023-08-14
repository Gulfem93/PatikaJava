package UsluSayiHesabi;

import java.util.Scanner;

public class UsluSayiHesabi {
    public static void main(String[] args) {
        int a, b;
        double ustu;

        Scanner ainput = new Scanner(System.in);
        System.out.printf("a: ");
        a = ainput.nextInt();

        Scanner binput = new Scanner(System.in);
        System.out.printf("b: ");
        b = binput.nextInt();

        ustu = Math.pow(a, b);
        System.out.printf(a + "^" + b  + " = " + ustu);
    }
}
