import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double toplam,armutF=2.14,elmaF=3.67,domatesF=1.11,muzF=0.95,patlıcanF=5.0;
        int a,e,d,m,p;

        System.out.print("Armudun kilosunu giriniz: ");
        a = inp.nextInt();
        System.out.print("Elmanin kilosunu giriniz: ");
        e = inp.nextInt();
        System.out.print("Domatesin kilosunu giriniz: ");
        d = inp.nextInt();
        System.out.print("Muzun kilosunu giriniz: ");
        m = inp.nextInt();
        System.out.print("Patlicanin kilosunu giriniz: ");
        p = inp.nextInt();

        toplam = (a*armutF)+(e*elmaF)+(d*domatesF)+(m*muzF)+(p*patlıcanF);

        System.out.println("Toplam Tutar: "+toplam);
    }
}
