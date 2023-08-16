package TekrarEdenSayilariBulma;

import java.util.Arrays;
import java.util.Scanner;

public class tekrarEdenSayi {
    private int n;

    public int getN() {
        return n;
    }
    public void setN(int n) {
        this.n = n;
    }

    public int[] array()
    {
        int length = this.getN();
        int[] list =  new int[length];
        int num;

        for(int i = 0; i < length; i++)
        {
            Scanner numinput = new Scanner(System.in);
            System.out.print("num: ");
            num = numinput.nextInt();
            list[i] = num;
        }

        return list;
    }

    public void hesap()
    {
        int length = this.getN();
        int [] list = array();
        Arrays.sort(list);

        System.out.println("Dizi: " + Arrays.toString(list));
        int[] l1 = new int[length];

        for(int i = 0; i < length; i++)
        {
            if (i < (length - 1))
            {
                if(list[i] != list[i + 1])
                {
                    continue;
                }
                l1[i] = list[i];
            }
        }

        int f = 0;
        int k = 0;

        for(int i: l1)
        {
            if(i != 0)
            {
                f ++;
            }
        }

        int[] l2 = new int[f];

        for(int i: l1)
        {
            if(i != 0)
            {
                l2[k] = i;
                k++;
            }
        }


        System.out.print("Tekrar eden değerler: " + Arrays.toString(l2));

    }

}
