import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double boy,indeks;
        int kilo;

        System.out.print("Lutfen Boyunuzu(metre cinsinde) Giriniz: ");
        boy = inp.nextDouble();
        System.out.print("Lutfen Kilonuzu Giriniz: ");
        kilo = inp.nextInt();

        indeks = kilo / (boy*boy);

        System.out.println("Kilonuz: "+kilo);
        System.out.println("Boyunuz: "+boy);
        System.out.println("Vucut Kitle indeksiniz: "+indeks);
    }
}
