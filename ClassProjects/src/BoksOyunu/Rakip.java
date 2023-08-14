package BoksOyunu;

public class Rakip {
    char yumrukYonuYA; //Yumruk yönü yukarıdan aşağı
    char yumrukYonuSS; //Yumruk yönü sağdan sola
    int rakipYumrukSiddeti;
    int rakipHealty;

    Rakip(char yumrukYonuYA, char yumrukYonuSS, int rakipYumrukSiddeti)
    {
        this.rakipYumrukSiddeti = rakipYumrukSiddeti;
        this.yumrukYonuSS = yumrukYonuSS;
        this.yumrukYonuYA = yumrukYonuYA;
        this.rakipHealty = 100;
    }

    public void RakipFight()
    {
        this.rakipHealty = this.rakipHealty - (int)(this.rakipYumrukSiddeti * 0.1);
    }
}
