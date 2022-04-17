import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;

        System.out.println("N sayisini giriniz : ");
        n = inp.nextInt();

        for(int i=(n-1);i>=0;i--)
        {
            for(int j=0;j<(n-i);j++)
            {
                System.out.print(" ");
            }

            for (int k=0;k<(2*i)-1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
