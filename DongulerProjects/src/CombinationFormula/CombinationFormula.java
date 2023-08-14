package CombinationFormula;

import java.util.Scanner;

public class CombinationFormula {
    public static void main(String[] args) {
        // ### Kombinasyon formülü
        //C(n,r) = n! / (r! * (n-r)!)

        int number1, number2, combination;
        int nFactoriyel = 1 , rFactoriyel = 1, nrFactoriyel = 1,  i = 1;
        System.out.println("C(n,r) ");
        Scanner number1input = new Scanner(System.in);
        System.out.printf("n: ");
        number1 = number1input.nextInt();

        Scanner number2input = new Scanner(System.in);
        System.out.printf("r: ");
        number2 = number2input.nextInt();

        //number1 -> n
        // n!
        while (i <= number1)
        {
            nFactoriyel =  nFactoriyel * i;
            i = i + 1;
        }

        i = 1;
        //number1 - number2 -> n -r
        // (n - r)!
        while (i <= (number1 - number2))
        {
            nrFactoriyel =  nrFactoriyel * i;
            i = i + 1;
        }

        i = 1;
        // number2 -> r
        // r!
        while (i <= number2)
        {
            rFactoriyel =  rFactoriyel * i;
            i = i + 1;
        }
        combination = nFactoriyel / (rFactoriyel * nrFactoriyel);

        System.out.printf("C(%d,%d): %d", number1, number2, combination);
    }
}
