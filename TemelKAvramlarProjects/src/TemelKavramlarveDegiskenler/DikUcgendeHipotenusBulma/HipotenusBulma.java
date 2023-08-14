package TemelKavramlarveDegiskenler.DikUcgendeHipotenusBulma;

import java.util.Scanner;

public class HipotenusBulma {
    public static void main(String[] args) {
        /**
         * Dik Üçgende Hipotenüs Bulan Program
         * Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.
         *
         * Ödev
         * Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
         *
         * Formül
         * Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
         *
         * 𝑢 = (a+b+c) / 2
         *
         * Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
         */
        double birinciKenar, ikinciKenar, hipotenus, cevre, alan;
        Scanner birinciKenarinput = new Scanner(System.in);
        Scanner ikinciKenarinput = new Scanner(System.in);

        System.out.print("Birinci Kenar: ");
        birinciKenar = birinciKenarinput.nextDouble();
        System.out.print("İkinci Kenar: ");
        ikinciKenar = ikinciKenarinput.nextDouble();

        hipotenus = Math.sqrt(Math.pow(birinciKenar, 2) + Math.pow(ikinciKenar, 2));

        cevre = hipotenus + birinciKenar + ikinciKenar;
        alan = (birinciKenar * ikinciKenar) / 2;
        System.out.println("Hipotenus: " + hipotenus);
        System.out.println("Ucgenin Cevresi: " + cevre);
        System.out.println("Ucgenin Alani: " + alan);

    }
}
