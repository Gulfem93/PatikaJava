package OgrenciBilgiSistemi;

public class Course {
    String name, code, prefix;
    int note;
    Teacher courseraTeacher;


    Course(String name, String code, String prefix)
    {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    public void addTeacher(Teacher t)
    {
        if(this.prefix.equals(t.branch))
        {
            this.courseraTeacher = t;
            System.out.println("İslem Başarılı");
        }
        else {
            System.out.printf(t.name + "Akademisyen dersi veremez");
        }
    }


    public void printTeacher()
    {
        if(courseraTeacher != null){
            System.out.printf(this.name + " dersinin Akademisyeni " + courseraTeacher.name);
        }else {
            System.out.printf(this.name + "dersine Akademisyen atanmamıştır. ");
        }

    }

}
