import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int mat,fizik,kimya,turkce,muzik,i=0;
        double ort=0;

        System.out.print("Lutfen matematik notunuzu girin: ");
        mat = inp.nextInt();
        System.out.print("Lutfen fizik notunuzu girin: ");
        fizik = inp.nextInt();
        System.out.print("Lutfen turkce notunuzu girin: ");
        turkce = inp.nextInt();
        System.out.print("Lutfen kimya notunuzu girin: ");
        kimya = inp.nextInt();
        System.out.print("Lutfen muzik notunuzu girin: ");
        muzik = inp.nextInt();


        if(mat<=100 && mat>=0)
        {
            ort += mat;
            i++;
        }
        if(fizik<=100 && fizik>=0)
        {
            ort += fizik;
            i++;
        }
        if(turkce<=100 && turkce>=0)
        {
            ort += turkce;
            i++;
        }
        if(kimya<=100 && kimya>=0)
        {
            ort += kimya;
            i++;
        }
        if(muzik<=100 && muzik>=0)
        {
            ort += muzik;
            i++;
        }

        ort = ort/i;

        if(ort <= 55)
        {
            System.out.println("Sinifta Kaldiniz! Ortalamaniz: "+ort);
        }
        else if(ort<55)
        {
            System.out.println("Sinifi Gectiniz,Tebrikler!  Ortalamaniz"+ort);
        }
    }
}
