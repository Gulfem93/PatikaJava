package TemelKavramlarveDegiskenler.VucutKitleIndeksiHesaplama;

import java.util.Scanner;

public class VucutKitleIndeksiHesaplama {
    public static void main(String[] args) {
        /**
         * Vücut Kitle İndeksi Hesaplama
         * Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
         *
         * Formül
         * Kilo (kg) / Boy(m) * Boy(m)*/

        float kilo, boy;
        float vucutKiloIndexi;

        Scanner kiloinput = new Scanner(System.in);
        Scanner boyinput = new Scanner(System.in);

        System.out.printf("Kilo: ");
        kilo = kiloinput.nextFloat();
        System.out.printf("Boy: ");
        boy = boyinput.nextFloat();

        vucutKiloIndexi = kilo / (boy * boy);
        System.out.printf("Vucut Kutle İndexi: %2f", vucutKiloIndexi);
    }
}
