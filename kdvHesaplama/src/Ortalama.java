import java.util.Scanner;

public class Ortalama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double kdv,kdvli,kdvfiyati,fiyat,kdvlifiyat;


        System.out.println("Lutfen fiyati giriniz:");
        fiyat = inp.nextDouble();
        System.out.println("Lutfen kdv oranini giriniz(virgullu bicimde):");
        kdv = inp.nextDouble();

        kdvfiyati = fiyat*kdv;
        kdvlifiyat = fiyat + (fiyat*kdv);

        System.out.println("KDV'siz Tutariniz:"+fiyat);
        System.out.println("KDV Orani:"+kdv);
        System.out.println("KDV Tutari:"+kdvfiyati);
        System.out.println("KDV'li Tutari:"+ kdvlifiyat);
    }
}
