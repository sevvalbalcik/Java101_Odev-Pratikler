import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int km,age,type;
        double pay=0.10,price;

        System.out.print("Yasinizi giriniz: ");
        age = inp.nextInt();
        System.out.print("Ucaginizin gidecegi yerin mesafesini(km) giriniz: ");
        km = inp.nextInt();
        System.out.print(" 1- Tek Yon \n 2- Gidis-Donus \n");
        System.out.print("Yolculuk tipini giriniz: \n");
        type = inp.nextInt();

        price = (km*pay);

        if((age > 0 && km > 0) && (type == 1 || type == 2))
        {
            if(age<12)
            {
                price -= (price*0.5);
                if(type==2)
                {
                    price -= (price*0.2);
                    price *= 2;

                }
            }
            else if (age>=12 && age<=24)
            {
                price -= (price*0.1);
                if(type==2)
                {
                    price -= (price*0.2);
                    price *= 2;

                }
            }
            else if(age>65)
            {
                price -= (price*0.3);
                if(type==2)
                {
                    price -= (price*0.2);
                    price *= 2;

                }
            }

        }
        else
        {
            System.out.println("Hatali Giris Yaptiniz!");
        }

        System.out.println("Bilet Fiyatiniz: " + price);

    }
}
