public class Course {
    Teacher teacher;
    Student student;
    String name;
    String code;
    String prefix;
    int note;
    int note2;

    Course(String name,String code,String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.teacher = teacher;
        this.note = note;
        this.note2 = note2;
        this.student = student;
    }void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        } else{
            System.out.println("Ogretmen ve Ders Bolumleri Uyusmuyor!");
        }
    }void dersSozlu(int note){
            student.c1.note2 *= 0.2;
            student.c2.note2 *= 0.1;
            student.c3.note2 *= 0.1;
    }



    void printTeacher(){
        this.teacher.print();
    }
}
