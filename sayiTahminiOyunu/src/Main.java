import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(100);
        int right = 0;
        boolean isWin = false,isWrong = false;
        int selected;
        int[] choice = new int[5];
        System.out.println(number);

        while(right < 5){
            System.out.print("Lutfen Tahmininizi Giriniz : ");
            selected = inp.nextInt();

            if(selected < 0 || selected > 100){
                System.out.println("Lutfen 100 ve 0 araliginda bir sayi giriniz : ");
                if(isWrong){
                    right++;
                    System.out.println("Fazla Hatali tuslama yaptınız, Kalan Hakkiniz : " + (5-right));
                }else{
                    System.out.println("Bir dahaki hatali girisinizde hakkinizdan dusulecektir !");
                    isWrong = true;
                }
                continue;
            }

            if(selected == number){
                System.out.print("Tebrikler dogru bildiniz, Sayi : " + number);
                isWin = true;
                break;
            }else{
                choice[right++] = selected;
                System.out.println("Tahmininiz yanlis,lutfen yeni bir sayi giriniz : ");
                if(selected > number){
                    System.out.println(selected + " sayisi,gizi sayidan buyuktur ");
                }else{
                    System.out.println(selected + " sayisi,gizli sayiden buyuktur ");
                }
                System.out.println("Kalan Hakkiniz : " + (5-right));
            }
        }

        if(!isWin){
            System.out.println("Kaybettiniz ! ");
            if(!isWrong){
                System.out.println("Tahminleriniz : " + Arrays.toString(choice));
            }
        }
    }
}
