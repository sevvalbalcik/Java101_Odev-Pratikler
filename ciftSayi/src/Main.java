import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int girilenSayi,t=0,k=0;
        double ort;

        System.out.print("Sayi Giriniz : ");
        girilenSayi = inp.nextInt();

        for(int i=0;i<=girilenSayi;i++)
        {
            if(i%3 == 0 && i%4 == 0 && i!=0)
            {
                t += i;
                k++;
            }
        }

        ort = t/k;

        System.out.println("3 ve 4'e bolunen sayilarin ortalamasi : "+ort);
    }
}
