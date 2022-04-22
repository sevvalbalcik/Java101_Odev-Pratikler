import java.util.Scanner;

public class Main {

    static void toplam(int a,int b){
        System.out.println("Sonuc : " + (a+b));
    }
    static void cikarma(int a,int b){
        System.out.println("Sonuc : " + (a-b));
    }
    static void bolme(int a,int b){
        if(b==0){
            System.out.println("Sayi 0'a bolunemez");
        }else {
            System.out.println("Sonuc : "+ (a/b));
        }
    }
    static void carpma(int a,int b){
        System.out.println("Sonuc : "+ (a*b));
    }
    static void us(int a,int b){
        for(int i=1;i<b;i++){
            a *= a;
        }
        System.out.println("Sonuc : "+ a);
    }
    static void mod(int a,int b){
        System.out.println("Sonuc : "+ (a%b));
    }
    static void dikdortgen(int a,int b){
        System.out.println("Alan : "+ (a*b));
        System.out.println("Cevre : "+ 2*(a+b));
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int select,a,b;
        String menu = "1 - Toplama Islemi\n" +
                "2 - Cikarma Islemi\n" +
                "3 - Bolme Islemi\n" +
                "4 - Carpma Islemi\n" +
                "5 - Uslu Sayi Hesaplama\n" +
                "6 - Mod Alma\n" +
                "7 - Dikdortgen Alan ve Cevre Hesabi\n" +
                "0 - Cikis\n" ;

        while(true){
            System.out.println(menu);
            System.out.print("Yapacaginiz islemi seciniz : ");
            select = inp.nextInt();

            if (select == 0){
                break;
            }

            System.out.print("1. sayiyi giriniz : ");
            a = inp.nextInt();
            System.out.print("2. sayiyi giriniz : ");
            b = inp.nextInt();

            switch(select){
                case 1:
                    toplam(a,b);
                    break;
                case 2:
                    cikarma(a,b);
                    break;
                case 3:
                    bolme(a,b);
                    break;
                case 4:
                    carpma(a,b);
                    break;
                case 5:
                    us(a,b);
                    break;
                case 6:
                    mod(a,b);
                    break;
                case 7:
                    dikdortgen(a,b);
                    break;
                default:
                    System.out.println("Hatali Giris Yaptiniz");

            }
        }
        System.out.println("Gule Gule...");
    }
}
