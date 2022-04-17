import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi,us,total=1;

        System.out.print("Sayi giriniz : ");
        sayi = inp.nextInt();
        System.out.print("Ussu giriniz : ");
        us = inp.nextInt();

        for(int i=0;i<us;i++)
        {
            total *= sayi;
        }

        System.out.println("Cevap " + total);
    }
}
