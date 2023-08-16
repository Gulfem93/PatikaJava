package harmonikOrtalamasiniHesapi;

import java.util.Arrays;

public class harmonikOrtalama {

    // Harmonik ortalama:  (1 + 1/2 + 1/3 + ... + 1/n) / n
    private int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double ortalama()
    {
        int length = this.getN();
        double[] list = new double[length];
        for(int i = 0; i < length; i++)
        {
            list[i] = 1 / (double)(i + 1);
        }

        double sum = 0;
        for(double i: list)
        {
            sum += i;
        }
        System.out.println("Liste: " + Arrays.toString(list));

        return sum / length;
    }

    public void yazdir()
    {
        double ort = ortalama();
        System.out.println("Harmonik Ortalama: " + ort);
    }

}
