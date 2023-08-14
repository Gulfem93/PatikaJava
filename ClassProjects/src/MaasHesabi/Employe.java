package MaasHesabi;

public class Employe {
    // name: adı, salary maaşı, workHours: Çalışma saati, hireYears: Başlama tarihi

    // Hesaplama için başka class ta tanımla
    private String name;

    public String getName(){
        return this.name;
    }
    public  void setName(String name)
    {
        this.name = name;
    }

    public double tax(double salary)
    {
        //
        if (salary > 1000)
            return salary * 3 / 100;
        return 0;
    }

    public double bonus(int workHours)
    {
        if(workHours > 40)
            return  (workHours - 40) * 30;
        return  0;
    }

    public double zam(double salary, int hireYears)
    {
        int seneFarki = 2021 - hireYears;

        if(seneFarki < 10) {
            return salary * 5 / 100;
        }else if(seneFarki < 19) {
            return salary * 10 / 100;
        }else if(seneFarki >= 19) {
            return salary * 15 / 100;
        }else {
            return 0;
        }
    }

    public void yazdir(double vergi, double bonus, double zam, double salaryWithExtras, double salary)
    {
        System.out.println("İsim: " + this.getName());
        System.out.println("Vergi: " + vergi);
        System.out.println("Bonus: " + bonus);
        System.out.println("Maas artışı: " + zam);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + salaryWithExtras);
        System.out.println("Toplam maaş: " + salary);
    }

    public void hesapla(double salary, int workHours, int hireYears)
    {
        double vergi = tax(salary);
        double bonus = bonus(workHours);
        double zam = zam(salary, hireYears);
        double salaryWithExtras = salary - vergi + bonus;
        double totalSalary = salary + zam;

        yazdir(vergi, bonus, zam, salaryWithExtras, totalSalary);
    }
}
