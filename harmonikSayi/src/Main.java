import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;
        double i,cevap=0.0;

        System.out.print("Sayi giriniz : ");
        n = inp.nextInt();

        for(i=1;i<=n;i++)
        {
            cevap += (1/i);
        }

        System.out.print("Cevap : "+cevap);
    }
}
