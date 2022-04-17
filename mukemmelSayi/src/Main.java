import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n, t = 0;

        System.out.print("Mukemmel olup olmadigini sorgulamak istediginiz sayiyi giriniz : ");
        n = inp.nextInt();

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                t += i;
            }
        }

        if (t == n) {
            System.out.println("Girdiginiz sayi mukemmel sayidir.");
        } else {
            System.out.println("Girdiginiz sayi mukemmel sayi degildir.");
        }
    }
}
