package kucukEnYakinSayiyiVeEnBuyukEnYakinSayiyiBulma;

import java.util.Arrays;
import java.util.Scanner;

public class kucukBuyukYakinSayilar {
    private int n;
    private int sayi;

    public int getN() {
        return n;
    }
    public void setN(int n) {
        this.n = n;
    }

    public int getSayi() {
        return sayi;
    }
    public void setSayi(int sayi) {
        this.sayi = sayi;
    }

    public int[] array()
    {
        int length = this.getN();
        int[] list = new int[length];

        int num;
        for(int i = 0; i < length; i++)
        {
            Scanner numinput = new Scanner(System.in);
            System.out.printf("num: ");
            num = numinput.nextInt();

            list[i] = num;
        }

        return list;
    }

    public void hesapla()
    {
        int[] list = array();
        Arrays.sort(list);

        int a = 0;
        System.out.println("Dizi : " + Arrays.toString(list));

        for(int i: list)
        {
            if(sayi < i) {
                a++;
                break;
            }
        }
        int min = list[a];
        int max = list[a + 1];

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);
    }
}
