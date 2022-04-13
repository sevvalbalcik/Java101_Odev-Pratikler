import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int a,b;
    double c;

    System.out.print("Ucgenin birinci kenarini giriniz: ");
    a = inp.nextInt();
    System.out.print("Ucgenin ikinci kenarini giriniz: ");
    b = inp.nextInt();

    c = Math.sqrt( a*a + b*b);

    System.out.print("Ucgeninizin hipotenusu: " + c);

    }
}
