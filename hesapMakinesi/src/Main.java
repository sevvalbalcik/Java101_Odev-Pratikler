import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n1,n2,select;

        System.out.print("Lutfen birinci sayiyi giriniz: ");
        n1 = inp.nextInt();
        System.out.print("Lutfen ikinci sayiyi giriniz: ");
        n2 = inp.nextInt();
        System.out.print(" 1- Toplama \n 2- Cikarma \n 3- Carpma \n 4- Bolme\n");
        System.out.print("Seciminiz: ");
        select = inp.nextInt();

        switch (select){
            case 1:
                System.out.print("Toplam: "+(n1+n2));
                break;
            case 2:
                System.out.print("Cikarma: "+(n1-n2));
                break;
            case 3:
                System.out.print("Carpma: "+(n1*n2));
                break;
            case 4:
                if(n2!=0)
                {
                    System.out.print("Bolum: "+(n1/n2));
                }
                else
                {
                    System.out.print("Bir sayi sifira bolunemez!");
                }

                break;
            default:
                System.out.print("Hatali giris yaptiniz!");

        }

    }
}
