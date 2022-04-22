import java.util.Scanner;

public class Main {

    static void asal(int sayi){
        int asal=1;
        for(int i=2;i<sayi;i++){
            if(sayi%i==0){
                asal = 0;
            }
        }
        if(asal == 1){
            System.out.println("Girdiginiz Sayi Asal");
        } else if(asal == 0){
            System.out.println("Girdiginiz Sayi Asal Degildir");
        }
    }


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi;

        System.out.print("Sayi Giriniz : ");
        sayi = inp.nextInt();
        asal(sayi);
    }
}
