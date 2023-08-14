package OgrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {
        Course fiz = new Course("Fizik", "Fizik101", "FZK");
        Course kim = new Course("Kimya", "Kimya101", "KMY");
        Course bio = new Course("Biyoloji", "Biyoloji101", "BİO");

        Teacher t1 = new Teacher("Ali IŞIK", "1997", "Biyoloji");
        Teacher t2 = new Teacher("Betül", "2500", "Kimya");
        Teacher t3 = new Teacher("Orhan", "5779", "Fizik");

        fiz.addTeacher(t3);
        kim.addTeacher(t2);
        bio.addTeacher(t1);

        Student s1 = new Student("İrem", "1", fiz, kim, bio);
        s1.addBulkExamNote(95, 85, 100);
        s1.isPass();

        Student s2 = new Student("Gülfem", "2", fiz, kim, bio);
        s2.addBulkExamNote(60, 70, 30);
        s2.isPass();

        Student s3 = new Student("Hakan", "3", fiz, kim, bio);
        s3.addBulkExamNote(70, 80, 50);
        s3.isPass();
    }
}
