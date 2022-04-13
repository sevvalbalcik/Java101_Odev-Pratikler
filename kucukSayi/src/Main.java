import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n1,n2,n3;

        System.out.print("Birinci sayiyi giriniz: ");
        n1 = inp.nextInt();
        System.out.print("Ikinci sayiyi giriniz: ");
        n2 = inp.nextInt();
        System.out.print("Ucuncu sayiyi giriniz: ");
        n3 = inp.nextInt();

        if(n1<n2 && n1<n3)
        {
            if(n2<n3)
            {
                System.out.print("n1 < n2 < n3");
            }
            else
            {
                System.out.print("n1 < n3 < n2");
            }
        }
        else if(n2<n1 && n2<n3)
        {
            if(n1<n3)
            {
                System.out.print("n2 < n1 < n3");
            }
            else
            {
                System.out.print("n2 < n3 < n1");
            }
        }
        else if(n3<n1 && n3<n2)
        {
            if(n1<n2)
            {
                System.out.print("n3 < n1 < n2");
            }
            else
            {
                System.out.print("n3 < n2 < n1");
            }
        }

    }
}
