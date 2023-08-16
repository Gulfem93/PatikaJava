package harmonikOrtalamasiniHesapi;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Harmonik ortalama:  (1 + 1/2 + 1/3 + ... + 1/n) / n

        harmonikOrtalama h1 = new harmonikOrtalama();

        int n;
        Scanner ninput = new Scanner(System.in);
        System.out.print("n: ");
        n = ninput.nextInt();
        h1.setN(n);

        h1.yazdir();
    }
}
