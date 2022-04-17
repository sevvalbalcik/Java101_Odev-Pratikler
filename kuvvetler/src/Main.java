import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int kullanici,i,j;

        System.out.print("Sayi giriniz : ");
        kullanici = inp.nextInt();

        for( i=1,j=1;i<=kullanici && j<=kullanici;i*=4,j*=5)
        {
            System.out.print( i + " ");
            System.out.print(j + " ");
        }
    }
}
