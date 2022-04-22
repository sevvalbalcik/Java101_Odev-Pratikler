import java.util.Scanner;

public class Main {

    static int power(int a,int b){
        int c=1;
        for(int i=0;i < b;i++){
            c *= a;
        }

        return c;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a,b;

        System.out.print("Sayiyi giriniz : ");
        a = inp.nextInt();
        System.out.print("Ussu giriniz : ");
        b = inp.nextInt();

        System.out.println("Sonuc : " + power(a,b));
    }
}
