import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String password,userName;
        int right = 3,select=0,bakiye=10461,istek;



        while (right!=0)
        {
            System.out.print("Adinizi giriniz : ");
            userName = inp.nextLine();
            System.out.print("Sifrenizi giriniz : ");
            password = inp.nextLine();

            if (userName.equals("patika") && password.equals("dev123"))
            {
                System.out.println("Bakiyeniz : "+bakiye);
                System.out.println("Merhaba X bankasina hosgeldiniz,yapmak istediginiz islemi seciniz : ");

             while (select != 4)  {
                System.out.println(" 1- Para Yatirma \n 2- Para Cekme \n 3- Bakiye Sorgula \n 4- Cikis Yap ");
                select = inp.nextInt();
                switch (select)
                {
                    case 1:
                        System.out.print("Yatirmak istediginiz miktari giriniz : ");
                        istek = inp.nextInt();
                        bakiye += istek;
                        break;
                    case 2:
                        System.out.print("Cekmek istediginiz miktari giriniz : ");
                        istek = inp.nextInt();
                         if (bakiye>=istek){
                             bakiye -= istek;
                         }else {
                             System.out.println("Bakiye Yetersiz ! ");
                         }
                        break;
                    case 3:
                        System.out.println("Mevcut Bakiyeniz : "+ bakiye);
                        break;
                    case 4:
                        break;
                    default:
                        System.out.print("Hatali Giris Yaptiniz");
                        break;
                } }
                    System.out.print("Tekrar Gorusmek Uzere..");
                    break;
            } else {
                System.out.println("Hatali Giris Yaptiniz, Tekrar Deneyiniz ");
                System.out.println("Kalan Hakkiniz : "+ --right);
                if(right==0){
                    System.out.println("Kartiniz Bloke Olmustur,Lutfen Bankanizla Iletisime Geciniz ");
                }
            }

        }
    }
}
