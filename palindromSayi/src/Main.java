import java.util.Scanner;

public class Main {

    static boolean isPalindrom(int sayi){
        int lastNumber,tersten = 0,temp = sayi;

        while (temp!=0){
            lastNumber = temp % 10;
            tersten = (tersten * 10) + lastNumber;
            temp /= 10;
        }

        if(sayi == tersten){
            return true;
        } else {
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi;

        System.out.print("Palindrom Olup Olmadigini Sorgulayacaginiz Sayiyi Giriniz : ");
        sayi = inp.nextInt();
        System.out.print(isPalindrom(sayi));
    }
}
