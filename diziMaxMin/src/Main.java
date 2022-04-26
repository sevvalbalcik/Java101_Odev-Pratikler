import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] dizi =  {15,12,788,1,-1,-778,2,0};
        int n,fark1,fark2=0,sayi = 0;

        System.out.print("Sayi Giriniz : ");
        n = inp.nextInt();

        for(int i=0;i< dizi.length;i++){
            fark1 = n - dizi[i];

            if(fark1 < fark2){
                sayi = dizi[i];
            }
            fark2 = fark1;
        }
        System.out.println(sayi);
        fark1 =0 ; fark2 = 0; sayi = 0;

        for(int i=0;i< dizi.length;i++){
            fark1 = dizi[i] - n;

            if(fark1 < fark2){
                if(dizi[i] > n){
                    sayi = dizi[i];
                }
            }
            fark2 = fark1;
        }
        System.out.println(sayi);
    }

}
