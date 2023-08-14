package YildizlarlaUcgenYapimi;

import java.util.Scanner;

public class YildizlarlaUcgenYapimi {
    public static void main(String [] args) {
        int uzunluk;
        String yildizlar = "";

        Scanner uzunlukinput = new Scanner(System.in);
        System.out.printf("Uzunluk: ");
        uzunluk = uzunlukinput.nextInt();


        for(int i = 1; i < uzunluk; i++)
        {
            for (int j = 1; j < (uzunluk - i); j ++)
            {
                yildizlar = yildizlar + " ";
            }

            for (int k = 1; k <= (2*i - 1); k++)
                yildizlar = yildizlar + "*";

            for (int m = 1; m < (uzunluk - i); m ++)
            {
                yildizlar = yildizlar + " ";
            }
            yildizlar = yildizlar + "\n";
        }
        System.out.printf(yildizlar);

    }
}
