public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuno;
    String classses;
    double avarage;
    boolean isPass;

    Student(String name,String stuno,String classses,Course c1,Course c2,Course c3){
        this.name = name;
        this.stuno = stuno;
        this.classses = classses;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }void AddBulkExamNote(int note1,int note2,int note3){
        if(note1<=100 && note1>=0){
            c1.note = note1;
        }if(note2<=100 && note2>=0){
            c2.note = note2;
        }if(note3<=100 && note3>=0){
            c3.note = note3;
        }
    }void printNote(){
        calcAvarage();
        System.out.println(c1.name + " Notu : "+ c1.note);
        System.out.println(c2.name + " Notu : "+ c2.note);
        System.out.println(c3.name + " Notu : "+ c3.note);
        System.out.println(c1.name + " Sozlu Notu : "+ c1.note2);
        System.out.println(c2.name + " Sozlu Notu : "+ c2.note2);
        System.out.println(c3.name + " Sozlu Notu : "+ c3.note2);
        System.out.println("Ortalamaniz : "+ this.avarage);
    }void isPass(){
        calcAvarage();
        if(this.avarage >= 55){
            printNote();
            System.out.println("Tebrikler,dersi gectiniz!");
        }else {
            printNote();
            System.out.println("Sinifta Kaldiniz!");
        }
    }void sozlu(int note1,int note2,int note3){
        if(note1<=100 && note1>=0){
            c1.note2 = note1;
        }if(note2<=100 && note2>=0){
            c2.note2 = note2;
        }if(note3<=100 && note3>=0){
            c3.note2 = note3;
        }
    }void calcAvarage(){
        this.avarage = (((this.c1.note)*0.8+(this.c1.note2)*0.2)+((this.c2.note)*0.9+(this.c2.note2)*0.1)+
                ((this.c3.note)*0.9+(this.c3.note2)*0.1))/3;
    }

}
