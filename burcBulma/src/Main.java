import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int month,day;

        System.out.print("Dogdunuz Gun: ");
        day = inp.nextInt();
        System.out.print("Dogdugunuz Ay: ");
        month = inp.nextInt();

        if(month == 1)
        {
            if(day < 22)
            {
                System.out.print("Oglak Burcusunuz!");
            }
            else if(day >= 22)
            {
                System.out.print("Kova Burcusunuz!");
            }
            else
            {
                System.out.print("Gecersiz Bir Gun Girdiniz!");
            }
        }
        else if(month == 2)
        {
            if(day < 20)
            {
                System.out.print("Kova Burcusunuz!");
            }
            else if(day >= 20)
            {
                System.out.print("Balik Burcusunuz!");
            }
            else
            {
                System.out.print("Gecersiz Bir Gun Girdiniz!");
            }
        }
        else if(month == 3)
        {
            if(day < 21)
            {
                System.out.print("Balik Burcusunuz!");
            }
            else if(day >= 21)
            {
                System.out.print("Koc Burcusunuz!");
            }
            else
            {
                System.out.print("Gecersiz Bir Gun Girdiniz!");
            }
        }
        else if(month == 4)
        {
            if(day < 21)
            {
                System.out.print("Koc Burcusunuz!");
            }
            else if(day >= 2)
            {
                System.out.print("Boga Burcusunuz!");
            }
            else
            {
                System.out.print("Gecersiz Bir Gun Girdiniz!");
            }
        }
        else if(month == 5)
        {
            if(day < 22)
            {
                System.out.print("Boga Burcusunuz!");
            }
            else if(day >= 22)
            {
                System.out.print("Ikizler Burcusunuz!");
            }
            else
            {
                System.out.print("Gecersiz Bir Gun Girdiniz!");
            }
        }
        else if(month == 6)
        {
            if(day < 23)
            {
                System.out.print("Ikizler Burcusunuz!");
            }
            else if(day >= 23)
            {
                System.out.print("Yengec Burcusunuz!");
            }
            else
            {
                System.out.print("Gecersiz Bir Gun Girdiniz!");
            }
        }else if(month == 7)
        {
            if(day < 23)
            {
                System.out.print("Yengec Burcusunuz!");
            }
            else if(day >= 23)
            {
                System.out.print("Aslan Burcusunuz!");
            }
            else
            {
                System.out.print("Gecersiz Bir Gun Girdiniz!");
            }
        }else if(month == 8)
        {
            if(day < 23)
            {
                System.out.print("Aslan Burcusunuz!");
            }
            else if(day >= 23)
            {
                System.out.print("Basak Burcusunuz!");
            }
            else
            {
                System.out.print("Gecersiz Bir Gun Girdiniz!");
            }
        }
        else if(month == 9)
        {
            if(day < 23)
            {
                System.out.print("Basak Burcusunuz!");
            }
            else if(day >= 23)
            {
                System.out.print("Terazi Burcusunuz!");
            }
            else
            {
                System.out.print("Gecersiz Bir Gun Girdiniz!");
            }
        }else if(month == 10)
        {
            if(day < 23)
            {
                System.out.print("Terazi Burcusunuz!");
            }
            else if(day >= 23)
            {
                System.out.print("Akrep Burcusunuz!");
            }
            else
            {
                System.out.print("Gecersiz Bir Gun Girdiniz!");
            }
        }else if(month == 11)
        {
            if(day < 22)
            {
                System.out.print("Akrep Burcusunuz!");
            }
            else if(day >= 22)
            {
                System.out.print("Yay Burcusunuz!");
            }
            else
            {
                System.out.print("Gecersiz Bir Gun Girdiniz!");
            }
        }
        else if(month == 12)
        {
            if(day < 22)
            {
                System.out.print("Yay Burcusunuz!");
            }
            else if(day >= 22)
            {
                System.out.print("Oglak Burcusunuz!");
            }
            else
            {
                System.out.print("Gecersiz Bir Gun Girdiniz!");
            }
        }
    }
}
