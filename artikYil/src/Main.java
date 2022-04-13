import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int year;

        System.out.print("Sorgulamak Istediginiz Yili Giriniz: ");
        year = inp.nextInt();

        if(year % 100 == 0)
        {
            if(year % 400 == 0)
            {
                System.out.println("Girdiginiz Yil: "+year);
                System.out.println("Girdiginiz Yil Artik Yildir!");
            }
            else
            {
                System.out.println("Girdiginiz Yil: "+year);
                System.out.println("Girdiginiz Yil Artik Yil Degildir!");
            }
        }
        else if(year % 4 == 0)
        {
            System.out.println("Girdiginiz Yil: "+year);
            System.out.println("Girdiginiz Yil Artik Yildir!");
        }
        else
        {
            System.out.println("Girdiginiz Yil: "+year);
            System.out.println("Girdiginiz Yil Artik Yil Degildir!");
        }
    }
}
