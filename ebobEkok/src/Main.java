import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi1,sayi2,i=1,ebob=0;

        System.out.print("Birinci sayiyi giriniz : ");
        sayi1 = inp.nextInt();
        System.out.print("Ikinci sayiyi giriniz : ");
        sayi2 = inp.nextInt();

        while(i!=sayi1)
        {
            if(sayi1%i == 0 && sayi2%i == 0)
            {
                ebob = i;
            }
            i++;
        }

        i=1;

        while (i != (sayi1 * sayi2))
        {
            if(i % sayi1 == 0 && i % sayi2 == 0)
            {
                System.out.println("Girdiginiz sayilarin ekoku : "+ i);
            }
            i++;

        }

        System.out.println("Girdiginiz sayilarin ebobu : "+ ebob);

    }
}
