package FaktoriyelHesabi;

import java.util.Scanner;

public class FaktoriyelHesabi {
    public static void main(String[] args) {

        int number, i = 1, faktoriyel = 1;
        Scanner numberinput = new Scanner(System.in);
        System.out.printf("Sayi: ");
        number = numberinput.nextInt();

        while (i <= number)
        {
            faktoriyel =  faktoriyel * i;
            i = i + 1;
        }

        System.out.printf(number + "!  = " + faktoriyel);
    }
}
