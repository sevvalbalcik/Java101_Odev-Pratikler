import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int eleman,sayi,i=1,max,min;

        System.out.print("Eleman sayisini giriniz : ");
        eleman = inp.nextInt();

        System.out.print(i +". sayiyi giriniz : ");
        sayi = inp.nextInt();

        max = sayi;
        min = sayi;

        while (i<=(eleman-1)){
            System.out.print(i+1 +". sayiyi giriniz : ");
            sayi = inp.nextInt();
            if(min < sayi && max < sayi) {
                max = sayi;
                if (sayi == 0) {
                    min = sayi;
                }
            } if(sayi < min && sayi < max){
                min = sayi;
                if (sayi == 0) {
                    min = sayi;
                }
            }
            i++;
        }
        System.out.println("En buyuk sayi : "+max);
        System.out.println("En kucuk sayi : "+min);
    }
}
