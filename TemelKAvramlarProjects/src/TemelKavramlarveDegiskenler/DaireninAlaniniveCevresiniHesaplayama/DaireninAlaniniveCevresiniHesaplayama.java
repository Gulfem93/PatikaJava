package TemelKavramlarveDegiskenler.DaireninAlaniniveCevresiniHesaplayama;

import java.util.Scanner;

public class DaireninAlaniniveCevresiniHesaplayama {
    public static void main(String[] args) {
        /**
         * Dairenin Alanını ve Çevresini Hesaplayan Program
         * Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

         Alan Formülü : π * r * r;
         Çevre Formülü : 2 * π * r;

         * Ödev
         Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
         𝜋 sayısını = 3.14 alınız.

         * Formül : (𝜋 * (r*r) * 𝛼) / 360*/

        int r, a;
        double alan, cevre;
        // merkez açısının ölçüsü 𝛼, yaricap r

        Scanner yaricapinput = new Scanner(System.in);
        System.out.print("Yaricapi: ");
        r = yaricapinput.nextInt();

        alan = 3.14 * (Math.pow(r, 2));
        cevre = 2 * 3.14 * r;

        System.out.println("Alan: " + alan);
        System.out.printf("Cevre: %.2f  ", cevre);

        Scanner ainput = new Scanner(System.in);
        System.out.print("\naci: ");
        a = ainput.nextInt();

        double merkezAcisininOlcusu = (3.14 * (r * r) * a);
        System.out.println("Merkez Acisinin Olcusu: " + merkezAcisininOlcusu);

    }
}
