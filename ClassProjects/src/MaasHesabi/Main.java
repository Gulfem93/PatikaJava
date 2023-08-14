package MaasHesabi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Employe e1 = new Employe();

        String name;
        double salary;
        int workHours, hireYears;

        Scanner nameinput = new Scanner(System.in);
        System.out.print("Adı: ");
        name = nameinput.nextLine();

        e1.setName(name);

        Scanner salaryinput = new Scanner(System.in);
        System.out.print("Maaşı: ");
        salary = salaryinput.nextInt();

        Scanner workHoursinput = new Scanner(System.in);
        System.out.print("Çalışma saati: ");
        workHours = workHoursinput.nextInt();

        Scanner hireYearsinput = new Scanner(System.in);
        System.out.print("Başlangıç yılı: ");
        hireYears = hireYearsinput.nextInt();

        e1.hesapla(salary, workHours, hireYears);



    }
}
