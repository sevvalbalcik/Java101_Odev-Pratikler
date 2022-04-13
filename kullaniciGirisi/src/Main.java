import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String password,userName,newPassword;
        int choise;

        System.out.print("Lutfen kullanici adini giriniz: ");
        userName = inp.nextLine();
        System.out.print("Lutfen sifrenizi giriniz: ");
        password = inp.nextLine();

        if( userName.equals("patika") && password.equals("java123"))
        {
            System.out.println("Giris Yaptiniz!");
        }
        else if(userName.equals("patika"))
        {
            System.out.println("Hatali Sifre Girdiniz !");
            System.out.println("Sifreyi sifirlamak istiyorsaniz 1'e basin ");
            choise = inp.nextInt();
            if(choise==1)
            {

                System.out.print("Yeni Sifreyi Giriniz: ");
                newPassword = inp.next();
                if (newPassword.equals(password))
                {
                    System.out.println("Sifre olusturulamadi, lutfen baska sifre giriniz.");
                }
                else
                {
                    System.out.println("Sifre Olusturuldu!");
                }


            }
            else
            {
                System.out.println("Sifre Olustur Secilmedi!");
            }

        }
        else
        {
            System.out.println("Kullanici Adi Yanlis Girildi!");
        }
}
}
