import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int kullanici,t=0;


        do {
            System.out.println("Sayi giriniz : ");
            kullanici = inp.nextInt();

            if(kullanici % 2 == 0 && kullanici % 4 == 0)
            {
                t += kullanici;
            }

        } while(kullanici % 2 == 0);

        System.out.println("Cift ve 4'un katlari olan sayilarin toplami : "+t);
    }
}
