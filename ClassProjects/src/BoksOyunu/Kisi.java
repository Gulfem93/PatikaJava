package BoksOyunu;

public class Kisi {
    char kisiYumrukYonuYA; // Yumruk yönü yukarıdan aşağı
    char kisiYumrukYonuSS; // Yumruk yönü sağdan sola
    int kisiYumrukSiddeti;
    int kisiHealty;

    Kisi(char kisiYumrukYonuYA, char kisiYumrukYonuSS, int kisiYumrukSiddeti)
    {
        this.kisiYumrukSiddeti = kisiYumrukSiddeti;
        this.kisiYumrukYonuSS = kisiYumrukYonuSS;
        this.kisiYumrukYonuYA = kisiYumrukYonuYA;
        this.kisiHealty = 100;
    }

    public void KisiFight()
    {
        this.kisiHealty = this.kisiHealty - (int)(this.kisiYumrukSiddeti * 0.1);
    }
}
