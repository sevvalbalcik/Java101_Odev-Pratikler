import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int temp;

        System.out.print("Sicakligi giriniz: ");
        temp = inp.nextInt();
    
        if(temp<5)
        {
            System.out.print("Kayak yapabilirsiniz.");
        }
        else if(temp>5 && temp<15)
        {
            System.out.print("Sinemaya Gidebilirsiniz.");
        }
        else if(temp==15)
        {
            System.out.print("Sinemaya Gidebilirsiniz veya Piknik Yapabilirsiniz.");
        }
        else if(temp>15 && temp<25)
        {
            System.out.print("Piknik Yapabilirsiniz.");
        }
        else if(temp>25)
        {
            System.out.print("Yuzmeye Gidebilirsiniz.");
        }

    }
}
