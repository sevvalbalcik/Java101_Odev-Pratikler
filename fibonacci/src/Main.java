import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n,ilk=1,ikinci=1,j;

        System.out.println("N sayisini giriniz : ");
        n = inp.nextInt();

        System.out.print(ilk + " " + ikinci + " ");

        for(int i=0;i<(n-2);i++)
        {
            j = ikinci;
            ikinci += ilk;
            ilk = j;

            System.out.print(ikinci + " ");
        }
    }
}
