import java.util.Scanner;

public class Ortalama {
    public static void main(String[] args) {
        int mat,fizik,kimya,turk,tarih,music;

        Scanner inp = new Scanner(System.in);

        System.out.println("Lutfen matematik notunuzu giriniz:");
        mat = inp.nextInt();
        System.out.println("Lutfen fizin notunuzu giriniz:");
        fizik = inp.nextInt();
        System.out.println("Lutfen kimya notunuzu giriniz:");
        kimya = inp.nextInt();
        System.out.println("Lutfen edebiyat notunuzu giriniz:");
        turk = inp.nextInt();
        System.out.println("Lutfen tarih notunuzu giriniz:");
        tarih = inp.nextInt();
        System.out.println("Lutfen muzik notunuzu giriniz:");
        music = inp.nextInt();

        int toplam = ( mat + fizik + kimya + turk+ tarih +music);
        double ort = toplam/6;
        System.out.println("Ortalamaniz:" + ort);

        boolean sonuc = (ort>=50) && (ort<=100);
        String str = sonuc ? "Gecti" : "Kaldi";
        System.out.println(str);
    }
}
