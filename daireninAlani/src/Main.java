import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int r;
        double pi=3.14,alan,cevre;

        System.out.print("Dairenin yari capini giriniz: ");
        r = inp.nextInt();

        alan = pi*r*r;
        cevre = 2*pi*r;

        System.out.println("Dairenizin yari capi: "+r);
        System.out.println("Dairenizin alani: "+alan);
        System.out.println("Dairenizin cevresi: "+cevre);
    }
}
