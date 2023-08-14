package OgrenciBilgiSistemi;

public class Student {
    // Nitelşkler
    String name, stuNo;
    int classes;
    Course fizik, kimya, biyoloji;
    int average;
    boolean isPass;

    Student(String name, String stuNo, Course fizik, Course kimya, Course biyoloji)
    {
        this.name = name;
        this.stuNo = stuNo;
        this.fizik = fizik;
        this.kimya = kimya;
        this.biyoloji = biyoloji;
        calcAvarage();
        this.isPass = false;
    }

    public void calcAvarage()
    {
        this.average = (this.fizik.note + this.kimya.note + this.biyoloji.note) / 3;
    }

    public void addBulkExamNote(int fiz, int kim, int bio)
    {
        if(fiz > 0 && fiz <= 100)
            this.fizik.note = fiz;
        if(bio > 0 && bio <= 100)
            this.biyoloji.note = bio;
        if(kim > 0 && kim <= 100)
            this.kimya.note = kim;
    }

    public void  isPass()
    {
        this.isPass = isCheckPass();
        printNote();
        System.out.println("Ortalama: " + this.average);
        if(this.isPass)
            System.out.println("Sınıfı Gecti");
        else
            System.out.println("Sınıfta Kaldı.");
    }

    public boolean isCheckPass()
    {
        calcAvarage();
        return this.average > 55;
    }

    public void printNote()
    {
        System.out.println(" ------------------- ");
        System.out.println("Ogrenci Name\t: " + this.name);
        System.out.println("Fizik\t: " + this.fizik.note);
        System.out.println("Kimya\t: " + this.kimya.note);
        System.out.println("Biyoloji\t: " + this.biyoloji.note);
    }
}
