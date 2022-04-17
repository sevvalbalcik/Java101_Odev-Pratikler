import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi,t=0,bas;

        System.out.print("Sayi giriniz : ");
        sayi = inp.nextInt();

        while( sayi != 0)
        {
            bas = sayi % 10;
            t += bas;
            sayi = sayi / 10;
        }

        System.out.println("Sayinizin Basamaklari Toplami : "+t);
    }
}
