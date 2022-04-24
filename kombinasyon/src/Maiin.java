import java.util.Scanner;

public class Maiin {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int eleman,secim,a=1,b=1,c=1,i;
        double komb;

        System.out.print("Eleman sayisini giriniz : ");
        eleman = inp.nextInt();
        System.out.print("Secim sayisini giriniz : ");
        secim = inp.nextInt();

        for(i=1;i<=eleman;i++){
            a *= i;
        }for(i=1;i<=secim;i++){
            b *= i;
        }for(i=1;i<=(eleman-secim);i++){
            c *= i;
        }

        komb = a /(b*c);
        System.out.println("Sonuc : "+komb);

    }
}
