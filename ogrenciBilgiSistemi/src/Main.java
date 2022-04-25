public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("SEVVAL","6134","FZK");
        Teacher t2 = new Teacher("ALPEREN","6161","TRH");
        Teacher t3 = new Teacher("BARIS","4141","ING");

        Course c1 = new Course("FIZIK","101","FZK");
        c1.addTeacher(t1);
        Course c2 = new Course("TARIH","102","TRH");
        c2.addTeacher(t2);
        Course c3 = new Course("INGILIZCE","103","ING");
        c3.addTeacher(t3);

        Student s1 = new Student("RUMEYSA","34567","4",c1,c2,c3);
        s1.AddBulkExamNote(70,50,52);
        s1.sozlu(96,52,74);
        s1.isPass();

    }
}
